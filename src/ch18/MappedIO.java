package ch18;

import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class MappedIO {
	private static int numOfInts = 4000000;
	private static int numOfUbuffInts = 200000;
	private abstract static class Tester{
		private String name;
		public Tester(String name){
			this.name = name; 
		}
		public void runTest(){
			System.out.print(name + " ");
			long start = System.nanoTime();
			try {
				test();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double duration = System.nanoTime() - start;
			System.out.format("%.2f\n",duration/1.0e9);
		}
		public abstract void test() throws IOException;
	}
	
	private static Tester[] tests = {
		//test 01
		new Tester("Stream Write") {
			@Override
			public void test() throws IOException {
				// TODO Auto-generated method stub
				DataOutputStream dos = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(new File("temp.tmp"))));
				for (int i = 0; i < numOfInts; i++) {
					dos.writeInt(i);
				}
				dos.close();
			}
		},
		//test 02
		new Tester("Mapping Write"){
			@Override
			public void test() throws IOException {
				// TODO Auto-generated method stub
				FileChannel fc = new RandomAccessFile("temp.tmp", "rw").getChannel();
				IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE,0,fc.size())
						.asIntBuffer(); 
				for (int i = 0; i < numOfInts; i++) {
					ib.put(i);
				}
				fc.close();
			}
		},
		//test03
		new Tester("Stream Read"){
			@Override
			public void test() throws IOException {
				// TODO Auto-generated method stub
				DataInputStream dis = new DataInputStream(
						new BufferedInputStream(
								new FileInputStream("temp.tmp")));
				for (int i = 0; i < numOfInts; i++) {
					dis.readInt();
				}
				dis.close();
			}
		},
		//test 04
		new Tester("Mapped Read"){
			@Override
			public void test() throws IOException {
				// TODO Auto-generated method stub
				FileChannel fc = new FileInputStream(
						new File("temp.tmp")).getChannel();
				IntBuffer ib = fc.map(FileChannel.MapMode.READ_ONLY,0,fc.size())
						.asIntBuffer();
				while(ib.hasRemaining()){
					ib.get();
				}
				fc.close();
			}
		},
		//test05
		new Tester("Stream Read/Write"){
			@Override
			public void test() throws IOException {
				// TODO Auto-generated method stub
				RandomAccessFile raf = new RandomAccessFile(new File("temp.tmp"), "rw");
				raf.writeInt(1);
				for(int i =0 ;i < numOfUbuffInts; i++){
					raf.seek(raf.length() - 4);
					raf.writeInt(raf.readInt());
				}
				raf.close();
			}
		},
		//test 06
		new Tester("Mapped read/Write"){
			@Override
			public void test() throws IOException {
				// TODO Auto-generated method stub
				FileChannel fc = new RandomAccessFile(new File("temp.tmp"), "rw")
					.getChannel();
				IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE,0,fc.size())
						.asIntBuffer();
				ib.put(0);
				for(int i =1 ;i < numOfUbuffInts; i++){
					ib.put(ib.get(i-1));
				}
				fc.close();
			}
			
		}
			
	};
	
	
	public static void main(String[] args) {
		for(Tester test : tests){
			test.runTest();
		}
	}
}
