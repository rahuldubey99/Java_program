class Employee{
    final void display(){
        System.out.println("Final method emp");
    }
    
}
class Em extends Employee{
     void display(){
        System.out.println("Final method   Em");
    }
    
}
public class finalMethod extends Employee {
    public static void main(String[] args) {
        Employee foo = new Employee();
        Em f = new Em();
        foo.display();
        f.display();
    }
}
