package otherTestPackge;

import java.nio.CharBuffer;

public class CharBufferTest {

	public static void main(String[] args) {
		CharBuffer buff = CharBuffer.allocate(8);
		System.out.println(buff.capacity());
		System.out.println(buff.limit());
		System.out.println(buff.position());
		buff.put('a');
		buff.put('b');
		buff.put('c');
		System.out.println(buff.position());
		// 调用flip()方法
		buff.flip();
		System.out.println(buff.limit());
		

	}

}
