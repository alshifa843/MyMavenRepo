package oopsprograms;

public class MethodOverL {
	
	
	
		public void show(int a ,int b)
		{
			System.out.println(a+" "+b);
		}
	    public void show(int a)
	    {
	    	System.out.println(a);
	    }

	public static void main(String[] args) {
		 MethodOverL obj = new MethodOverL();
		 obj.show(2,7);
		 obj.show(3);
	}

}
