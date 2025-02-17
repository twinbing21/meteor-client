package net.runelite.api;

public interface Buffer extends Node
{
    byte[] getPayload();
    int getOffset();

    void writeMediumMiddle$api(int i);
    int readUByteAdd();
    int readUByteNeg();
    int readUByteSub();
    byte readByteAdd();
    byte readByteNeg();
    byte readByteSub();
	int readUnsignedByte$api();
	byte readByte$api();
	int readUnsignedShort$api();
	int readShort$api();
	String readString();
    int readShortLE();
	int readShortSmart$api();
	int readUShortSmart$api();
	void writeByte$api(int i);
	void writeInt$api(int i);
	void writeIntLE$api(int i);
	void writeIntIME(int i);
	void writeIntME$api(int i);
	int readInt$api();
    int readIntLE$api();
    int readIntIME();
    int readIntME();
    void writeShortLE$api(int i);
    void writeShortAdd(int i);
    void writeShortAddLE(int i);
    int readUShortLE();
    int readUShortAdd();
    int readShortAddLE();
	void writeLong$api(long l);
	void writeLongMedium$api(long l);
	void writeShort$api(int i);
    void writeByteAdd(int i);
    void writeByteSub(int i);
    void writeByteNeg(int i);
    void writeString(String s);
}