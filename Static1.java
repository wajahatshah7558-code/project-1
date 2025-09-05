 class Outer {
     int a = 10;
     static int b = 15;
     public void a() {
         System.out.println("the value of a is" + a);
         System.out.println("the value of b is" + b);
     }
     static class Inner {
         public void mymesg() {
             System.out.println("getting static value of outer loop" + b);
         }
     }
 }
      public class Static1 {
          public static void main(String[] args) {
              //    Outer s1 = new Outer();
              // int message = new int();
              //  s1.a();
              Outer.Inner mesg = new Outer.Inner();
              mesg.mymesg();
          }
      }

