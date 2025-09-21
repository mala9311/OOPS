abstract class Person{
    
    abstract void show();
Person(){
        System.out.println("parent constructor called");
    }
}
class Student extends Person{
    
    Student(){
        super();
        System.out.println("Child contructor called");
    }
    public void show(){
        System.out.println("Hello Abstraction");
    }
}


public class Main_Abstract {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
    }
    
}
