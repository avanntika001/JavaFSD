
public class ManualTypeConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 100.50D;
		
		double d2 = 20.50D;
		
		int result = (int)(d1/d2);
	    System.out.println(result);
	    
	    long l1 = 123;
	    		
	    short s1 = (short) 11;
	    
	    
	    System.out.println(s1);
	    
	    
	    long l2 = 1234_5678L;
	    short s2 = (short)l2;
	    
	    System.out.println(s2);
	    
	    
	    byte b1 = 66;
	    char c1 = (char)b1;
	    System.out.println(c1);
	    
	    

	}

}
