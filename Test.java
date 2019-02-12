import java.awt.*;
public class Test{
	public Test(){
			
	}
	public static boolean isInteger(String s) {
    	try { 
   	     	Integer.parseInt(s); 
  	  	} catch(NumberFormatException e) { 
        	return false; 
    	} catch(NullPointerException e) {
        	return false;
    	}
    return true;
	}
}