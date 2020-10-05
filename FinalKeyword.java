/**
 * Employee
 */

 class Employee {

    final int RegNo;
    Employee(int RegNo){
        this.RegNo = RegNo;
    }
    void display(){
        System.out.println("RegNO :"+RegNo);
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Employee RN = new Employee(23);
        RN.display();

    }
    
}
