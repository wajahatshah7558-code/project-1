class animal{
    void sound (){
        System.out.println("Animal makes a sound");
    }
    void eat (String food){
        System.out.println("Animal eats" + food);
    }
    void eat (String food, int quantity){
        System.out.println("Animal eats " + quantity + "units of" + food);
    }
}
    class dog extends animal{
        void sound() {
            System.out.println("dog bars");
        }
}
        class zoo extends dog{
            void name() {
                System.out.println("naional park");
            }

            void ticket(int price) {
                System.out.println("the ticket of zoo is" + price);
            }

            void tickets(int quantity) {
                System.out.println("quantity of tickets is" + quantity);
            }
        }            class cat extends zoo {
                void name(){
                    System.out.println("Animals lives in zoo");
                }
            }

public class Inheritance {
    public static void main(String[]args){
        zoo z = new zoo();
        animal a = new animal();
        a.sound();
        z.name();
        z.ticket(20);
        z.tickets(5);
        z.eat("bone");
        z.eat("bone" , 4);
        z.sound();
    }
}
