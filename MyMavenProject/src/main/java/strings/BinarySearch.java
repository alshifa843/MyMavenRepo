package strings;
import java.util.Arrays;

public class BinarySearch {
	
	
	public static int binarySearch(int arr[],int key)
	
	{ int l= 0,h = arr.length-1;
	while(l<=h) {
	int mid = l+(h-l)/2;
	
		if(key==arr[mid])
		{
			return mid;
			
		}else if(key<arr[mid])
		{
			h = mid-1;
		//	l =l;
		}else
		{
			l = mid+1;
			 //h = h;
		}
	}
	return -1;
	}
	
public static void main(String[] args) {	
  int array[]= {3,5,6,1,0,2,8,10,11};
  Arrays.sort(array);
  int key = 11;
int result = (binarySearch(array,key));
 if (result != -1) {
     System.out.println("Element found at index: " + result);
 } else {
     System.out.println("Element not found in the array.");
	}
}
}
