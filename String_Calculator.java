/******************************************************************************

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	   try{
		args[0]= args[0].replace("n",",");
	       int[] arr = Arrays.stream(args[0].split(","))
                          .mapToInt(Integer::parseInt)
                          .toArray();

		    int sum = 0;
	            if(arr.length !=0)
	            {
	                for (int i=0;i<arr.length; i++)
	                {
	                    sum += arr[i];
	                }
	            }
	            System.out.println("Sum is "+sum);
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
