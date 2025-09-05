public class Finalmain {
    public static void main(String[] args) {
        System.out.println(180);
        Circle c = new Circle();
        double result = c.area(3);
        System.out.println("Area " + result);
//        final Student s1 = new dt("Ali", 44);
        Student nw  = new Student();
        nw.dt("wajahat",12);
        System.out.println(nw.name);
        System.out.println(nw.rollnumber);
        //System.out.println(s1.name);
        //System.out.println(s1.rollnumber);

    }
}
