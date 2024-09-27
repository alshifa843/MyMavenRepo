package strings;

public class SumOfArray {
	
	public static int arraySum(int arr[],int i)
	{
		 
		if(i==arr.length)
		{
			return 0;
		}
		return arraySum(arr,i+1)+arr[i];
	}

	public static void main(String[] args) {
	  int array[] = {1,2,12};
	  int count =array.length;
	 int sum = arraySum(array,0);
	 float avg = sum/count; 
	  System.out.println(arraySum(array,0));
	  System.out.println(avg);

}
}