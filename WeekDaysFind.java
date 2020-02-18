//This program is to find a day on the basis of given day and the given number.
//For example: if given day is "Sunday" and the given number is 5
//it should return "Friday".]

import java.util.*;
import java.util.Map.Entry;

public class DemoTest
{
	public String TestDays(String S, long K) 
	{
        HashMap<Integer,String> days = new HashMap<Integer,String>();
		int i = 0;
		String[] weeks = new String[] {"Mon", "Tue", "Wed", "Thurs", "Fri" , "Sat", "Sun"};
		for(i = 0; i < weeks.length; i++) 
		{
			days.put(i, weeks[i]);
		}
		
		for (Entry<Integer, String> m:days.entrySet())
		{ 
			if(S.equals(m.getValue())) 
			 {
				//get key corresponding to days
				 int z = m.getKey();
				 //calculate the key of the given days based on given number( long k)
				 //mod 7 gives the range of number between  0 to 7  
				 long y = (z + K) % 7;
				 //get the value(days) based on calculated key
				 String val = days.get((int) y);
				 System.out.println(val);
			 }
			 
	    } 
		return null;
		
	}
	public static void main(String arg[]) 
	{
		DemoTest c = new DemoTest();
		c.TestDays("Thurs",15236100);
	}
}
