
//        }
//  abstract class Animal{
//    abstract   void makesound();
//
//
//      void sleep(){
//
//        System.out.println("animals sleep");
//    }
//  }
//  class Dog extends Animal{
//      void makesound() {
//          System.out.println("dog barks");
//      }
//        void sleep(){
//
//          System.out.println("dog sleeps");
//          }
//    }
//    class Cat extends Animal{
//    void makesound(){
//        System.out.println("cat ,meow");
//    }
//    void sleep(){
//        System.out.println("Cat sleeps");
//    }
//    }
//    class Abstract_Prac{
//        public static void main(String[] args) {
//          Animal a = new () ;
//
//          Animal a1 = new Dog();
//            a1.sleep();
//            a1.makesound();
//            Animal a2 = new Cat();
//            a2.makesound();
//            a2.sleep();
//        }
//    }


//          Animal[] animals = {s1, s2, s3, s4};
//          System.out.println("\nlooping of all animals");
//
//          for (Animal animal : animals) {
//              animal.makesound();
//          }
//      }
//  }
//                rectangle r = new rectangle();
//               r.getarea(4,5);
//
//                shape s = new shape();
//                s.getarea(3.14f, 2);
//
//                triangle t = new triangle();
//                t.getarea(4,5);

//                shape s1 = new shape();
//                shape s2 = new rectangle();
//                shape s3 = new triangle();
//                s1.getarea();
//                s2.getarea();
//                s3.getarea();
import java.util.Scanner;

class Animal{
     void  makesound(){
        System.out.println("Animals make sound");
    }
}
class Cat extends Animal{
    public void makesound(){
        System.out.println("meows,meow");
    }
}
class Dog extends Animal{
    public void makesound(){
        System.out.println("bow,bow");
    }
}
class Cow extends Animal{
    public void makesound(){
        System.out.println("ahhhhha");
    }
}
class Polymorphism2_Pra{
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal name (cat/dog/cow)");
        String name = sc.nextLine().toLowerCase();
        Animal animal;
        switch (name) {
            case "cat":
                animal = new Cat();
                break;
            case "dog":
                animal = new Dog();
                break;
            case "Cow":
                animal = new Cow();
                break;
            default:
                System.out.println("undefined animal name");
                animal = new Animal();
        }
                animal.makesound();

    }
}

