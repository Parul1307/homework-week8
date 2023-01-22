package constructor;

public class Example2 {
    int modalyear;
    String modalname;

    Example2 (int year, String name){
        modalyear = year;
        modalname = name;

    }
  public static void main(String[] args){
        Example2 example2 = new Example2(2022,"BMW");
        System.out.println(example2.modalyear+" "+example2.modalname);

  }
}
