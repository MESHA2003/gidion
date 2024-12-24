public class Test {
  static int a = 7;
 int b = 10;
 public Test (){
    a=5;
    b=10;
 }
 public static void main(String[] args) {
 Test obj1 = new Test();
 obj1.a++;
 obj1.b++;
 Test obj2 = new Test();
 System.out.println("obj1.a: " + obj1.a);
 System.out.println("obj2.a: " + obj2.a);
 System.out.println("obj1.b: " + obj1.b);
 System.out.println("obj2.b: " + obj2.b);
 }
    
}
