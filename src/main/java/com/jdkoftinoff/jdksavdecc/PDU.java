package com.jdkoftinoff.jdksavdecc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PDU {

    public final static int MTU = 1500;
    private byte destination_address[];
    private byte source_address[];
    private short ethertype;
    protected ByteBuffer data;

    PDU() {
        this.destination_address = new byte[6];
        this.source_address = new byte[6];
        this.ethertype = (short) 0x22f0;
        this.data = ByteBuffer.allocateDirect(MTU);
        this.data.order(ByteOrder.BIG_ENDIAN);
    }

    PDU(PDU other) {
        this.destination_address = other.destination_address;
        this.source_address = other.source_address;
        this.ethertype = other.ethertype;
        this.data = other.data;
    }

    PDU(
            ByteBuffer data,
            byte destination_address[],
            byte source_address[],
            short ethertype) {
        this.destination_address = destination_address;
        this.source_address = source_address;
        this.ethertype = ethertype;
        this.data = data;
        this.data.order(ByteOrder.BIG_ENDIAN);
    }

    public byte[] getDestinationAddress() {
        return destination_address;
    }

    public void setDestinationAddress(byte a[]) {
        destination_address = a;
    }

    public byte[] getSourceAddress() {
        return source_address;
    }

    public void setSourceAddress(byte a[]) {
        source_address = a;
    }

    public short getEthertype() {
        return ethertype;
    }

    public void setEthertype(short v) {
        ethertype = v;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public void setData(ByteBuffer b) {
        data = b;
    }

    public final static int getLength(
            ByteBuffer data) {
        return data.capacity();
    }

    public int getLength() {
        return this.data.capacity();
    }

    public final static boolean getBit(
            ByteBuffer data,
            int start_offset,
            int bitnum_from_msb) {
        int additional = bitnum_from_msb / 8;
        int leftover = bitnum_from_msb & 7;
        byte mask = (byte) (0x80 >> leftover);
        byte v = data.get(start_offset + additional);

        return (v & mask) != 0 ? true : false;
    }

    public boolean getBit(
            int start_offset,
            int bitnum_from_msb) {
        return getBit(data, start_offset, bitnum_from_msb);
    }

    public final static void setBit(
            ByteBuffer data,
            int start_offset,
            int bitnum_from_msb,
            boolean newValue) {
        int additional = bitnum_from_msb / 8;
        int leftover = bitnum_from_msb & 7;
        byte mask = (byte) (0x80 >> leftover);
        byte orig = (byte) (data.get(start_offset + additional) & (~mask));
        byte v = orig;
        if (newValue) {
            v |= mask;
        }

        data.put(start_offset + additional, v);
    }

    public void setBit(
            int start_offset,
            int bitnum_from_msb,
            boolean newValue) {
        setBit(data, start_offset, bitnum_from_msb, newValue);
    }

    public final static int getBitField(
            ByteBuffer data,
            int start_offset,
            int mask,
            int shift) {
        int v = (data.getInt(start_offset) >> shift) & mask;
        return v;
    }

    public int getBitField(
            int start_offset,
            int mask,
            int shift) {
        return getBitField(data, start_offset, mask, shift);
    }

    public final static void setBitField(
            ByteBuffer data,
            int start_offset,
            int mask,
            int shift,
            int value) {
        int orig = data.getInt(start_offset) & (~(mask << shift));
        int v = ((value & mask) << shift);
        data.putInt(start_offset, orig | v);
    }

    public void setBitField(
            int start_offset,
            int mask,
            int shift,
            int value) {
        setBitField(data, start_offset, mask, shift, value);
    }

    public final static byte[] getEUI64Field(
            ByteBuffer data,
            int start_offset) {
        byte r[] = new byte[8];
        data.get(r, start_offset, 8);
        return r;
    }

    public final static byte getOctetField(
            ByteBuffer data,
            int start_offset) {
        return data.get(start_offset);
    }

    public byte getOctetField(int start_offset) {
        return getOctetField(data, start_offset);
    }

    public final static void setOctetField(
            ByteBuffer data,
            int start_offset,
            byte newValue) {
        data.put(start_offset, newValue);
    }

    public void setOctetField(
            int start_offset,
            byte newValue) {
        setOctetField(data, start_offset, newValue);
    }

    public final static short getDoubletField(
            ByteBuffer data,
            int start_offset) {
        return data.getShort(start_offset);
    }

    public short getDoubletField(int start_offset) {
        return getDoubletField(data, start_offset);
    }

    public final static void setDoubletField(
            ByteBuffer data,
            int start_offset,
            short newValue) {
        data.putShort(start_offset, newValue);
    }

    public void setDoubletField(
            int start_offset,
            short newValue) {
        setDoubletField(data, start_offset, newValue);
    }

    public final static int getQuadletField(
            ByteBuffer data,
            int start_offset) {
        return data.getInt(start_offset);
    }

    public int getQuadletField(int start_offset) {
        return getQuadletField(data, start_offset);
    }

    public final static void setQuadletField(
            ByteBuffer data,
            int start_offset,
            int newValue) {
        data.putInt(start_offset, newValue);
    }

    public void setQuadletField(
            int start_offset,
            int newValue) {
        setQuadletField(data, start_offset, newValue);
    }

    public final static long getOctletField(
            ByteBuffer data,
            int start_offset) {
        return data.getLong(start_offset);
    }

    public long getOctletField(int start_offset) {
        return getOctletField(data, start_offset);
    }

    public final static void setOctletField(
            ByteBuffer data,
            int start_offset,
            long newValue) {
        data.putLong(start_offset, newValue);
    }

    public void setOctletField(
            int start_offset,
            long newValue) {
        setOctletField(data, start_offset, newValue);
    }

    public byte[] getEUI64Field(int start_offset) {
        return getEUI64Field(data, start_offset);
    }

    public final static void setEUI64Field(
            ByteBuffer data,
            int start_offset,
            byte eui64[]) {
        data.put(eui64, start_offset, 8);
    }

    public void setEUI64Field(
            int start_offset,
            byte eui64[]) {
        setEUI64Field(data, start_offset, eui64);
    }

    public final static byte[] getEUI48Field(
            ByteBuffer data,
            int start_offset) {
        byte r[] = new byte[6];
        data.get(r, start_offset, 6);
        return r;
    }

    public byte[] getEUI48Field(
            int start_offset) {
        return getEUI48Field(data, start_offset);
    }

    public final static void setEUI48Field(
            ByteBuffer data,
            int start_offset,
            byte eui48[]) {
        data.put(eui48, start_offset, 6);
    }

    public void setEUI48Field(
            int start_offset,
            byte eui48[]) {
        setEUI48Field(data, start_offset, eui48);
    }

}
