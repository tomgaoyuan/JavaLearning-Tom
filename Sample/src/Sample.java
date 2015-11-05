/**
 * This is a java learning sample
 */
import java.util.*;

public class Sample {
	public static void main( String[] args) {
//Sample  : the usage of args
		for (String arg : args) System.out.println(arg);

		demos.Lottery.work();

		//demos.Decoder.work();
/*		
//sample : the usage of constructor
		//object variable and object
		Date date =new Date();
		System.out.println(date.toString());
*/
		//demos.ICalendar.work();
		
		demos.HelloWorld.work();
	} 	//end main
} //end class

