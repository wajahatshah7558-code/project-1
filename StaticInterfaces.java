
    interface Myinterface {
        static int max = 15;

        void show() ;


    }
    class Myclass implements Myinterface{
        public void show  (){
            System.out.println("Max is " + Myinterface.max);
        }
    }

public class StaticInterfaces{
    public static void main(String[] args) {
        Myclass subj = new Myclass();
        subj.show();
        System.out.println(Myinterface.max);
    }
}

   // void main() {
//}
