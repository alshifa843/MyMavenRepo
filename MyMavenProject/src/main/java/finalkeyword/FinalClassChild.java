package finalkeyword;

public class FinalClassChild extends FinalClass{
	public void display() {
		System.out.println("hii world");
	}

	public static void main(String[] args) {
	 
		FinalClassChild obj = new FinalClassChild();
		obj.display();
		obj.show();

	}

}
//here in parent class we declared as final ,so can't do inheritance