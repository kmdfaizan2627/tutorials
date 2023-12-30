package istatic.nonstatic;
class Example{
	
    static int a = 20;
           int b = 30;
	static void free() {
		int c= 59;
		System.out.println(c);
	}
 void f2(){
	  int n = 45;
	  int a = 60;
	  String s = "imran";
	System.out.println(n);
	System.out.println(a);
	System.out.println(s);
}
	static void f3(){
		int age= 21;
		if(age>20) {
			System.out.println("yes you are Eligible");
		}
		else {
			System.out.println("you are not Eligible");
		}
	}
}
class Example5{
	static int z=1001;

}
class Example2{
	 void g1()
	{
		int n = 56;
		System.out.println(n);
	}
}
public class Practice2 { 
  	int f= 88;
	
 public static void main(String[] args) {
	 Practice2 obj3 = new Practice2();
	 System.out.println(obj3.f);
	 Example2 obj1 = new Example2();
	 obj1.g1();
	 Example obj = new Example();
	 System.out.println(obj.b); 
	 obj.f2();
	 System.out.println(Example.a);
     Example.f3();
     Example.free();
    System.out.println(Example5.z);
 }}


