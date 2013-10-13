package com.jdkoftinoff.jdksavdecc;

import java.nio.ByteBuffer;

public class AECPDU_AEM extends AECPDU {
	AECPDU_AEM() {
        super();
    }

	AECPDU_AEM(PDU other) {
        super(other);
    }

	AECPDU_AEM(ByteBuffer data, byte destination_address[], byte source_address[], short ethertype) {
        super(data, destination_address, source_address, ethertype);
    }

	public final static int unsolicited_offset = control_packet_additional_offset + 8;
	public final static int unsolicited_bit = 16;
	
    public final static int command_type_offset = control_packet_additional_offset + 10;
    public final static int command_type_mask=0x7fff;
    
    public final static void setUnsolicited( ByteBuffer data, boolean newValue ) {
    	setBit(data, unsolicited_offset, unsolicited_bit, newValue);
    }
    
    public final void setUnsolicited( boolean newValue ) {
    	setUnsolicited( data, newValue );
    }
    
    public final static boolean getUnsolicited( ByteBuffer data ) {
    	return getBit(data, unsolicited_offset, unsolicited_bit );
    }
    
    public final boolean getUnsolicited() {
    	return getUnsolicited(data);
    }
    
    public final static void setCommandType( ByteBuffer data, short newValue ) {
    	setBitField(data, command_type_offset-2, command_type_mask, 0, newValue );
    }
    
    public void setCommandType( short newValue ) {
    	setCommandType( data, newValue );
    }
    
    public final static short getCommandType( ByteBuffer data ) {
    	return (short) getBitField(data, command_type_offset-2, command_type_mask, 0 );
    }
    
    public short getCommandType() {
    	return getCommandType(data);
    }
    
	public final static int command_specific_data_offset = control_packet_additional_offset + 12;
	
	public final static void setCommandSpecificDataLength( ByteBuffer data, int l ) {
		setControlDataLength(data,l+12);		
	}
	
	public final void setCommandSpecificDataLength( int l ) {
		setControlDataLength(data,l);
	}
	
	public final static int getCommandSpecificDataLength( ByteBuffer data ) {
		int l = (int)getControlDataLength(data); 
		if( l<12 ) {
			l=0;
		}
		else {
			l=l-12;
		}
		return l;
	}
	
	public final int getCommandSpecificDataLength() {
		return getCommandSpecificDataLength(data);
	}
}
