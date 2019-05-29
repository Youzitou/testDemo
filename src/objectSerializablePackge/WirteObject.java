package objectSerializablePackge;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.CharBuffer;
import java.nio.channels.Channel;

public class WirteObject {

	public static void main(String[] args) {
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/object.txt"));
			Person per = new Person("ËïÎò¿Õ",500);
			oos.writeObject(per);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
