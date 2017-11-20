package 数据传输流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		long sj = 123456779;
		dos.writeLong(sj);
		
		byte[] sz = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(sz);
		DataInputStream dis = new DataInputStream(bis);
		long ss = dis.readLong();
		System.out.println(ss);
	}
}
