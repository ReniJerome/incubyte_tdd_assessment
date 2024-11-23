/******************************************************************************

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	   try{
	       int[] arr = Arrays.stream(args[0].split(","))
                          .mapToInt(Integer::parseInt)
                          .toArray();
	   }
	   	catch(NumberFormatException e)
		{
		    System.out.println("The input should be a comma separated list of integers");
		    System.out.println(e);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
		 
	}
}
