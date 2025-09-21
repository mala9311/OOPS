 interface Innerinterfc {
     String Name = "Mala";   // final and static
    int Age = 21;
    void show(); // public and abstract are in-built in interface
    void output();
   default void name(){
    System.out.println("default method");
   }
    
}
interface Middleinterfc {
    void add();
}
class Outerinterfc implements Innerinterfc , Middleinterfc{
   public void show(){
        System.out.println("show method");
    }
    public void output(){
        System.out.println("output method");
    }
    public void add(){
        System.out.println("add method");
    }
}
public class interfc {
    public static void main(String[] args) {
        Outerinterfc o1 = new Outerinterfc();
        o1.show();
        o1.output();
        System.out.println(Innerinterfc.Name);
        System.out.println(Innerinterfc.Age);
    }
    
}
