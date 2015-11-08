package InCoding;

public class ExceptionTest {
	public static void  throwTest() throws IException{	
	//ok like this
	//public static void  throwTest(){
		throw new IException("IException");
	}
}