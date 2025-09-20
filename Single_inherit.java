class one{
    protected String Name;
    protected int Age;
    void output(){
        System.out.println("Name is :" + Name);
        System.out.println("Age is :" + Age);
    }
}
class two extends one{

}

public class Single_inherit{
    public static void main(String[] args){
        two T1 = new two();
        T1.Name = "Mala";
        T1.Age = 21;
        T1.output();
    }
}










 
    



