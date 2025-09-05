import java.util.Scanner;

public class practice_loops {
    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <5;  i++) {
//            for (int j = i; j > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//            for (int l = n; l >0 ; l--) {
//                for(int k = 0;k<l;k++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//    }
//        int n = 5;
//        for (int i = 1; i <= 5; i++) {
//            for(int j = i; j >0 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//          for (int l = n;l>0;l--){
//              for (int k = 0;k<l;k++){
//                  System.out.print("*");
//              }
//              System.out.println();
//          }
//
//    }
//}

         Scanner in = new Scanner(System.in);
            int t = in.nextInt();
                for(int i = 0;i<t;i++){


                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int[] num = new int[n];
                for (int j = 0; j <= n; j++) {
                    int sCal = a;
                    for (int k = j; k >0; k--) {
                        sCal = sCal + (int) Math.pow(2, k) * b;

                    }
                    num[j - 1] = sCal;
                }
                for (int numbers : num) {
                    System.out.print(numbers + " ");
                }
                System.out.println();

            }
        }

        }

