package ���ݴ�����;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		long aa = 123456789;
		dos.writeLong(aa);
		
		byte[] zjsz = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(zjsz);
		DataInputStream dis = new DataInputStream(bis);
		long ss = dis.readLong();
		System.out.println(ss);
	}

}
