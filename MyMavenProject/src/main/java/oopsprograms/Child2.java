package oopsprograms;
 class Child2 extends Parent {
	 
	 public void child2() {
		 System.out.println("ramus another child komu");
	 }

	public static void main(String[] args) {
		
		Child1 obj1 = new Child1();
		obj1.singleParent();
		obj1.child1();
	  
		Child2 obj = new Child2();
		obj.child2();
		 	

	}

}
