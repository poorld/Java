package 数据传输流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		//发送
		ByteArrayOutputStream zjszl = new ByteArrayOutputStream();
		DataOutputStream sjl = new DataOutputStream(zjszl);
		long aa = 123456789;
		sjl.writeLong(aa);
		
		//接收
		byte[] zjsz = zjszl.toByteArray();
		ByteArrayInputStream srl = new ByteArrayInputStream(zjsz);
		DataInputStream sjsr = new DataInputStream(srl);
		long ss = sjsr.readLong();
		System.out.println("ss=" + ss);
	}

}
