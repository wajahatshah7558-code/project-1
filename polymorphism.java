class calculator{

public int add (int a,int b){
return a + b;
}
public int add (int a,int b,int c){
return a+b+c;
}
}

public class polymorphism { 


    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(3, 4));
        System.out.println(calc.add(2, 4, 6));
        calculator2 calc2 = new calculator2();
        System.out.println(calc2.sab(10,2));
        System.out.println(calc2.sab(20,5,2));

        add ad = new add();
        System.out.println(ad.ad(2,4));
        System.out.println(ad.ad(2,4,8));

        multiply mul = new multiply();
        System.out.println(mul.mult(4,4));
        System.out.println(mul.mult(2,4,6));

        divide div = new divide();
        System.out.println(div.div(15,3));
        System.out.println(div.div(15,8,3));

        modul mod = new modul();
        System.out.println(mod.mod(15,7));
        System.out.println(mod.mod(25,15,7));
    }
}
class calculator2{
    public int sab(int num1,int num2){
        return num1 - num2;

    }
    public int sab (int num1,int num2,int num3){
        return num1-num2-num3;
    }
}
    class add{
        public int ad(int num1,int num2 ){
            return num1 + num2;
        }
        public int ad (int num1,int num2 ,int num3){
            return num1 +num2+num3;
        }
    }
        class multiply {
            public double mult(double num1, double num2) {
                return num1 * num2;
            }

            public double mult(double num1, double num2, double num3) {
                return num1 * num2 * num3;
            }
        }
            class divide{
                public float div(float num1,float num2){
                    return num1 / num2;
                }
                public float div(float num1,float num2,float num3){
                    return num1/num2/num3;
                }
            }
                class modul{
                    public int mod(int num1 , int num2){
                        return num1%num2;
                    }
                    public int mod(int num1,int num2,int num3){
                        return num1%num2%num3;
                    }
                }




