class Employee{
    final void display(){
        System.out.println("Final method");
    }
    
}
public class finalMethod extends Employee {
    public static void main(String[] args) {
        Employee foo = new Employee();
        
        foo.display();
    }
}
