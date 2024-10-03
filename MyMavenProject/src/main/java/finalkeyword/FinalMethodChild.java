package finalkeyword;

public class FinalMethodChild extends FinalMethod{
	
	
	public void show() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		FinalMethodChild obj = new FinalMethodChild();
		obj.show();

	}

} 
// here we used final keyword ,so no method overridding