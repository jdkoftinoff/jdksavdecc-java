package com.jdkoftinoff.jdksavdecc;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AVTPDU extends PDU {
	
	AVTPDU() {
		super();
	}

	AVTPDU( PDU other ) {
		super( other );
	}
	
	AVTPDU( ByteBuffer data, byte destination_address[], byte source_address[], short ethertype ) {
		super(data,destination_address,source_address,ethertype);
	}

	public final static byte cd_mask = (byte)0x80;
	public final static byte CD_CONTROL = (byte)0x80;
	public final static byte CD_DATA = (byte)0x00;

	public final static void setCDControl( ByteBuffer data ) {
		setBit(data,0,0,true);
	}
	
	public void setCDControl() {
		setCDControl(data);
	}

	public final static boolean getCDControl( ByteBuffer data ) {
		return getBit(data,0,0);
	}
	
	public boolean getCDControl() {
		return getCDControl(data);
	}
	
	public final static byte subtype_mask = (byte)0x7f;
	
	public final static byte SUBTYPE_61883_IIDC = (byte)0x00;
	public final static byte SUBTYPE_MMA = (byte)0x01;
	public final static byte SUBTYPE_AVTP_AUDIO = (byte)0x02;
	public final static byte SUBTYPE_AVTP_VIDEO = (byte)0x03;
	public final static byte SUBTYPE_AVTP_CONTROL = (byte)0x04;
	public final static byte SUBTYPE_VENDOR = (byte)0x6f;
	public final static byte SUBTYPE_ADP = (byte)0x7a;
	public final static byte SUBTYPE_AECP = (byte)0x7b;
	public final static byte SUBTYPE_ACMP = (byte)0x7c;
	public final static byte SUBTYPE_MAAP = (byte)0x7e;
	public final static byte SUBTYPE_EXPERIMENTAL = (byte)0x7f;
	
	private static final Map<Integer, String> subtypeMap = createSubTypeMap();
	
	public static final String getSubtypeName( byte subtype ) {
		if( subtypeMap.containsKey((int)subtype) ) {
			return subtypeMap.get((int)subtype);
		}
		else {
			return null;
		}
	}

    private static Map<Integer, String> createSubTypeMap() {
        Map<Integer, String> result = new HashMap<Integer, String>();
        
        result.put((int)SUBTYPE_61883_IIDC, "SUBTYPE_61883_IIDC");
        result.put((int)SUBTYPE_MMA, "SUBTYPE_MMA");
        result.put((int)SUBTYPE_AVTP_AUDIO, "SUBTYPE_AVTP_AUDIO");
        result.put((int)SUBTYPE_AVTP_VIDEO, "SUBTYPE_AVTP_VIDEO");
        result.put((int)SUBTYPE_AVTP_CONTROL, "SUBTYPE_AVTP_CONTROL");
        result.put((int)SUBTYPE_VENDOR, "SUBTYPE_VENDOR");
        result.put((int)SUBTYPE_ADP, "SUBTYPE_ADP");
        result.put((int)SUBTYPE_AECP, "SUBTYPE_AECP");
        result.put((int)SUBTYPE_ACMP, "SUBTYPE_ACMP");
        result.put((int)SUBTYPE_MAAP, "SUBTYPE_MAAP");
        result.put((int)SUBTYPE_EXPERIMENTAL, "SUBTYPE_EXPERIMENTAL");
        return Collections.unmodifiableMap(result);
    }

	public final static byte getSubtype( ByteBuffer data ) {
		byte v=(byte) (data.get(0) & subtype_mask);
		return v;
	}
    
	public byte getSubtype() {
		return getSubtype(data);
	}

	public final static void setSubtype( ByteBuffer data, byte newValue) {
		byte orig=(byte)(data.get(0) & (~subtype_mask) );
		newValue &= subtype_mask;
		newValue |= orig;
		data.put(0, (byte) newValue );
	}
	
	public void setSubtype(byte newValue) {
		setSubtype( data, newValue );
	}

	
}
