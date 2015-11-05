/**
 * the usage of String 
 */
package demos;

import java.util.Scanner;

public class Decoder {
	public static void work() {
		System.out.println("Please input:");
		Scanner in = new Scanner(System.in);
		String s;
		//boolean continueFlag=true;
		//a java style 
		mainLoop:
		do {
			s=in.nextLine();
			//TEST LINE:
			//s = new String(Character.toChars(0x1D56B));
			switch (s) {
				case "QUIT":
					System.out.println("Quiting...");
					//continueFlag=false;
					//break;
					break mainLoop;
				default :
					int code=0;
					for (int index=0; index< s.length(); index++ ) {
						System.out.printf("0x%x",(int)s.charAt(index));
						code=s.codePointAt(index);
						if (Character.isSupplementaryCodePoint(code)) {
							index++;
							System.out.printf("0x%x",(int)s.charAt(index));
						}
						System.out.printf("->U+%x\n", code);
					}
				}
			}
		//while (continueFlag);
		while (true);
				
		in.close();
		System.out.println("Quited.");	
	}

}
