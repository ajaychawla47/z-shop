package myproject;

public class MyClass {

	 int a;
	 int b;
	
	 int add(int a,int b) {
		return a+b; 
	 }
	 
	 public static void main(String[]args) {
		 MyClass mc = new MyClass();
		 System.out.println(mc.add(10, 20));
		 
	 }
	
}
