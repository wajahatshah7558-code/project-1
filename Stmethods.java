//class FruitShop{
//    static String Shopname = "Martz";
//     void Shopinfo(){
//        System.out.println("Shop name is " + Shopname);
//    }
//}
/*class UserCounter {
    // Step 1: Declare static variable totalUsers
    static int user = 20;
    void counter(){
    user++;
    System.out.println("count is " + user);
    }
}
    // Step 2: Create constructor that increments totalUsers
public class Stmethods {
    public static void main(String[] args) {
        // Step 3: Create 3 UserCounter objects
        UserCounter u1 = new UserCounter();
        UserCounter u2 = new UserCounter();
        UserCounter u3 = new UserCounter();
        u1.counter();
        u2.counter();
        u3.counter();
    }
}*/
class LoginSystem{
    static int LoginCount = 0;

 static void login() {
     LoginCount++;
     System.out.println("total number count is " + LoginCount);
 }
 }
class Name{
    static {
        String name = "Rashid";
        System.out.println("Name : "+name);
    }
   static void myIfo(){
        System.out.println("Wajahat Ali SHAH");
    }
}
class OUter1{
    static class  Inner{
        void show(){
            System.out.println("nested class is used");
        }
    }
}







