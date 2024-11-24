
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	      try{
	    String args1 = "//;\n1;2;3";
	     char delimiter = ',';
	     

	     if(args1.startsWith("//"))
	     {
	         delimiter = args1.charAt(2);
	         args1 = args1.substring(2, (args1.length() - 1));
	           args1 = args1.replaceAll(String.valueOf(delimiter),",");   
	     } 
		args1= args1.replace("n",",");
		args1= args1.replace(",,",",");
		System.out.println(args1);	
	       int[] arr = Arrays.stream(args1.split(",")).mapToInt(Integer::parseInt).toArray();
		      List<Integer> negative_numbers = new ArrayList<>[];

		    int sum = 0;
	            if(arr.length !=0)
	            {
	                for (int i=0;i<arr.length; i++)
	                {
				
	                    sum += arr[i];
			if (arr[1]<0)
			{
				negative_numbers.add(arr[i]);
	                }
	            }
		if (!negative_numbers.isEmpty)
			System.out.println("Negative numbers are "+negative_numbers);
		else
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
