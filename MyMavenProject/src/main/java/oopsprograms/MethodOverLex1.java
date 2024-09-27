package oopsprograms;

public class MethodOverLex1 {
	
	
	public float sample(int a,float b)
	{
		float p = a+b;
		
		return p;
	}
    public float sample(float c,int d)
    {
    	float q = c+d;
    	return q;
    	
    }
	public static void main(String[] args) {
		MethodOverLex1 obj = new MethodOverLex1();
		System.out.println(obj.sample(2,9.6f));
		System.out.println(obj.sample(8.9f, 3));
		
	}
 
}
