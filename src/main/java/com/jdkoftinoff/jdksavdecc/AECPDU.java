package com.jdkoftinoff.jdksavdecc;

import java.nio.ByteBuffer;

public class AECPDU extends AVTPDU {
	AECPDU() {
        super();
    }

	AECPDU(PDU other) {
        super(other);
    }

	AECPDU(ByteBuffer data, byte destination_address[], byte source_address[], short ethertype) {
        super(data, destination_address, source_address, ethertype);
    }

	public final static int AEM_COMMAND = 0;
	public final static int AEM_RESPONSE = 1;
	public final static int ADDRESS_ACCESS_COMMAND = 2;
	public final static int ADDRESS_ACCESS_RESPONSE = 3;
	public final static int AVC_COMMAND = 4;
	public final static int AVC_RESPONSE = 5;
	public final static int VENDOR_UNIQUE_COMMAND = 6;
	public final static int VENDOR_UNIQUE_RESPONSE = 7;
	public final static int EXTENDED_COMMAND = 14;
	public final static int EXTENDED_RESPONSE = 15;
	
	public final static int getMessageType(ByteBuffer data) {
		return getControlData(data);
	}
	
	public final int getMessageType() {
		return getControlData(data);
	}
	
	public final static void setMessageType(ByteBuffer data, int newValue ) {
		setControlData(data,newValue);
	}
	
	public final void setMessageType( int newValue ) {
		setControlData(data,newValue);
	}

	public final static int STATUS_SUCCESS = 0;
	public final static int STATUS_NOT_IMPLEMENTED = 1;
	
	public final static int MAXIMUM_AECP_CONTROL_DATA_LENGTH = 524;
	
	public final static byte[] getTargetEntityID(ByteBuffer data) {
		return getStreamID(data);
	}
	
	public final byte[] getTargetEntityID()
	{
		return getStreamID(data);
	}
	
	public final static void setTargetEntityID(ByteBuffer data, byte[] newValue ) {
		setStreamID(data,newValue);
	}
	
	public final void setTargetEntityID( byte[] newValue ) {
		setStreamID(data,newValue);
	}
	
	public final static int controller_entity_id_offset = control_packet_additional_offset + 0;
	
    public final static void setControllerEntityID(ByteBuffer data, byte[] eui64) {
        setEUI64Field(data, controller_entity_id_offset, eui64);
    }

    public final void setControllerEntityID( byte[] eui64 ) {
    	setControllerEntityID(data,eui64);
    }

    public final static byte[] getControllerEntityID(ByteBuffer data ) {
        return getEUI64Field(data, controller_entity_id_offset );
    }

    public final byte[] getControllerEntityID() {
        return getControllerEntityID( data );
    }
	
    public final static int sequence_id_offset = control_packet_additional_offset + 8;
    
    public final static void setSequenceID( ByteBuffer data, short newValue ) {
    	setDoubletField(data, sequence_id_offset, newValue );
    }
    
    public void setSequenceID( short newValue ) {
    	setSequenceID( data, newValue );
    }
    
    public final static short getSequenceID( ByteBuffer data ) {
    	return getDoubletField(data,sequence_id_offset );
    }
    
    public short getSequenceID() {
    	return getSequenceID(data);
    }
    
}
