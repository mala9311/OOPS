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
class Professor extends Student_1{

}
public class Hierarchical_inherit {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.Name = "Mala";
        p1.Age = 21;
        p1.output();
        Teacher t1 = new Teacher();
        t1.Name = "Archana";
        t1.Age = 9;
        t1.Salary = 2300;
        t1.output();
        t1.output1();
    }

    
}
