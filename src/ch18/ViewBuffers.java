package ch18;

import static net.mindview.util.Print.*;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class ViewBuffers {
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.wrap(new byte[]{0,0,0,0,0,0,0,'a'});
		bb.rewind();
		printnb("Byte Buffer ");
		while(bb.hasRemaining()){
			printnb(bb.position() + "->" +bb.get() +", " );
		}
		System.out.println();
		
		CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer(); 
		printnb("Char Buffer ");
		while(cb.hasRemaining()){
			printnb(cb.position() + "->" +cb.get() +", " );
		}
		System.out.println();
	}
}
