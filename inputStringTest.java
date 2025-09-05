import utils.yoga;

public class inputStringTest {
    public static void main(String[]args){
        yoga Yoga = new yoga();
        Yoga.getwaight("wajahat ali");

        int number = Yoga.getwaight(12);
        System.out.println("mu waight is " + number);

        String string = Yoga.getwaight(7,"Ali");
        System.out.println(string);

        double Double = Yoga.getwaight("wajahat",5 );
        System.out.println("this is my doubel number" + Double);


    }
}
