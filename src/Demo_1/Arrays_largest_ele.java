package Demo_1;

import java.util.Arrays;

public class Arrays_largest_ele {
	 static int y;
	public static void main(String[] args)
	{
	   int arr [] = {3,56,7,9,13,67,108,98,45, 78};
	Arrays.sort(arr);
	     int n = arr.length;
	
//	  for (int i = 0; i < n; i++)
//	{
//		 for (int j = i+1; j < n ; j++)
//		 {
//			if(arr[i]>arr[j])
//			{
//				y=arr[i];
//				arr[i]=arr[j];
//				arr[j]=y;
//				
//			   }
//		  }
//	  }
	 System.out.println(arr[n-1]);

	}
	}
