package Arrays1;

import java.util.Arrays;

public class PrintArray 
{
	public static void main(String[] args)
	{
//		int arr[]= {465,56,55,5,78,59,965};
//		System.out.println(arr[0]);
		String country="INDIA";
		//char Array
		char[] k=country.toCharArray();
		System.out.println(k.getClass().getName()+"=="+k[0]+" "+k.length);
		System.out.println(Arrays.toString(k));
		
		//Split
		String[] vals=country.split("");
		System.out.println(vals[0]+" "+vals.length);
		
	}	
}
