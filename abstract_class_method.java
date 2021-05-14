abstract class calculate{
    double base,height;
    calculate(double x, double y){
        base = x;
        height = y;
    }
    abstract double area();

}
class Rectangle extends calculate{
    Rectangle(double x,double y){
        super(x,y);

    }
    double area(){
        System.out.println("The area of rectangle is:");
        return base*height;
    }
}
class Triangle extends calculate{
    Triangle(double x,double y){
        super(x,y);
    }
    double area(){System.out.println("The area of the triangle is ");
    return base *height/2;
}
}
public class abstract_class_method{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15,25);
        Triangle triangle = new Triangle(10,45);
        calculate cal;
        cal = triangle;
        System.out.println("The area is  a triangle is:"+cal.area());
        cal = rectangle;
        System.out.println("The rectangle:"+cal.area());
    }
}