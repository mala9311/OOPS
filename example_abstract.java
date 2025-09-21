abstract class Shape{
    abstract double area();
}
class Square extends Shape{
    double side;
    Square(double side){
        this.side = side;

    }
    double area(){
        return side * side;
         
    }
}
class Triangle extends Shape{
    double Base;
    double Height;
    Triangle(double Base , double Height){
        this.Base = Base;
        this.Height = Height;
        }
        double area(){
            return 0.5 * Base * Height;
        }
}
public class example_abstract {
    public static void main(String[] args) {
        Square s1 = new Square(4);
        Triangle t1 = new Triangle(12, 010);
       System.out.println("Area of Square :" + s1.area()); 
        System.out.println("Area of Triangle :" + t1.area());
    }
    
}
