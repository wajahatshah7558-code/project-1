public class ForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Ferari","Honda","Civic"};
        String[] cars2 = {"Ferari","Honda","Civic","wagnor"};
        for (String i : cars){
            System.out.println(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Cars value at index" + i + cars2[i]);
        }
    }
}
