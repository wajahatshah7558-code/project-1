class coordinator{
    void name (){
        System.out.println("the name of coordinator is ");
    }
}
class subcoord extends coordinator{
    void name(){
        System.out.println("sub cals the coordinator");
    }
}
class prof extends coordinator{
    void name (){
        System.out.println("prof clls coord");
    }
}
public class inheritpract {
    public static void main(String[] args) {
 subcoord sub = new subcoord();
 sub.name();
prof p = new prof();
p.name();

    }
}
