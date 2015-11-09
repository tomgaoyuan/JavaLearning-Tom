package InCoding;

import java.util.*;
import java.net.*;
import java.io.*;

public class EchoServer {
	public static void work() {
		final int PORT = 4096;
		try {
			ServerSocket serverSkt = new ServerSocket(PORT);
			System.out.println("Listening...");
			Socket skt = serverSkt.accept();
			System.out.println("Accepted.");			
			try {
				InputStream is = skt.getInputStream();
				OutputStream os = skt.getOutputStream();
				Scanner inScn = new Scanner(is);
				
				String helloStr = new String("HELLO\n");
				os.write(helloStr.getBytes());
				boolean end = false;
				//the sequence is important for affection
				while( !end && inScn.hasNext()) {
					String inLine = inScn.nextLine();
					if (inLine.trim().equals("BYE")) end = true;
					os.write(("echo: " + inLine.trim() + "\n" ).getBytes());
					System.out.println(inLine);
				}
				inScn.close();
			}finally {
				System.out.println("Closing...");
				skt.close();
				serverSkt.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
