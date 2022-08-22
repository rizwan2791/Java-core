import java.util.*;
public class Test {

	public static void main(String[] args) {
		int sum=0;
		int arr[] = {10,20,30,40,50,60 };
		int min = arr[0];
		int max= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
			sum=sum+arr[i];
			
			
		}
		Arrays.sort(arr);
		if (arr.length %2 !=0) {
			System.out.println("Median : "+arr[arr.length/2]);
		}
		System.out.println("Median : "+( arr[arr.length/2]+arr[arr.length/2-1])/2.0);
		
		System.out.println(min);
		System.out.println(max);
		System.out.println("sum :"+sum);
		System.out.println("avg : "+sum/arr.length);
		
		int size = arr.length;
		countFrequency(arr,size);
	}
	static void countFrequency(int[] arr,int size)
	{
		Arrays.sort(arr);
		for (int i=0 ; i <size; i++) {
			int count=1;
			while( i <size-1 && arr[i]==arr[i+1])
			{
				i++;
				count++;
			}
			System.out.println(arr[i]+ ":"+count);
		}
	}
}