
public class wideningDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue = 10;
		
		short shortValue = 200;
		
		int intValue = 30000;
		
		long longValue =  234_156_678L;
		
		// -> Valid Widening
		longValue = intValue;
		
		// -> Valid Widening
		intValue = shortValue;
		
		// -> Valid Widening
	    shortValue = byteValue;
	    
	    
	    // -> No Widening
	    byteValue = shortValue;
	}

}
