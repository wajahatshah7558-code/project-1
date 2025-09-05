class Value1 {
     int a = 10 ;

    Value1(int a) {
        this.a = a;
        System.out.println("a : " + a);

    }
        void display () {
            System.out.println("the value is " + this.a);
        }
    }

 class Book {
     String title;
     int rate;
  Book(){
      this("java basics" ,100);
      System.out.println("Default constructor");
  }
  Book(String title,int rate){
      this.title = title;
      this.rate = rate;
      System.out.println("parametarised constructor");
  }
  void display(){
      System.out.println("title " + title + "rate " + rate);
  }
 }





