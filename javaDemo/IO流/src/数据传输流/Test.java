package ���ݴ�����;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		//����
		ByteArrayOutputStream zjszl = new ByteArrayOutputStream();
		DataOutputStream sjl = new DataOutputStream(zjszl);
		long aa = 123456789;
		sjl.writeLong(aa);
		
		//����
		byte[] zjsz = zjszl.toByteArray();
		ByteArrayInputStream srl = new ByteArrayInputStream(zjsz);
		DataInputStream sjsr = new DataInputStream(srl);
		long ss = sjsr.readLong();
		System.out.println("ss=" + ss);
	}

}
