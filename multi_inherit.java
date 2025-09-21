class Student_1{
    String Name;
    int Age;
    void output(){
        System.out.println("Name is :"+ Name);
        System.out.println("Age is :"+ Age);
    }
}
class Teacher extends Student_1{
    int Salary;
    void output1(){
        System.out.println("Salary :"+ Salary);
    }
}
class Professor extends Teacher{

}
public class multi_inherit {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.Name ="Mala";
        p1.Age = 21;
        p1.Salary = 800000;
        p1.Name ="Archana";
        p1.Age = 8;
        p1.Salary = 8900;
        p1.output();
        p1.output1();
        p1.output();
        p1.output1();
    }
    
}
