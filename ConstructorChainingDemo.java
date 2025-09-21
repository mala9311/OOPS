class Grandparent{
    Grandparent(){
        System.out.println("Grandparent constructor called");
    }
}
class Parent extends Grandparent{
    Parent(){
        System.out.println("parent constructor called");
    }
}
class child extends Parent{
    child(){
        System.out.println("child constructor called");
    }
}
public class ConstructorChainingDemo {
    public static void main(String[] args) {
        child c1 = new child();
        
    }
}
