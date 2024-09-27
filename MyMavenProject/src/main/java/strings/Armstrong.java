package strings;

public class Armstrong {
	
	public static boolean armsStrong(int num)
	{ 
		int power = power(num);
		int copyName  = num; 
		int sum =0;
	 while(copyName != 0)
	 {
		 int lastdigit =  copyName%10;
		 int factor =1;
	    
		for(int i =0;i<power;i++)
		{
			factor =  factor*lastdigit;
		}
		
		sum = sum + factor;
		copyName = copyName/10; 
	 }
		
		
		if(sum==num) {
			return true;
		}
		return false;
		
	}

	public static int power(int num)
	
	{
		int n = 0;
		while(num!=0)
		{
			n++;
			num = num/10;
		} 
		return n;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Armstrong.armsStrong(153));
	
	}

}
