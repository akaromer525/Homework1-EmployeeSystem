//Akar Omer Ali
package employeehomework;

public class TestEmployee {
    
    public static void main (String [] args){

        Employee emp1 = new Employee ("Akar", "Omer", 2000.0);
        
        Employee emp2 = new Employee ("Shadyar", "Faruq", 5000.0);
        
        System.out.println("NAME               YEARLY SALARY        MONTHLY SALARY");
        System.out.println("----------------   --------------       --------------");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "\t\t" + emp1.getYearlySalary() + "\t\t" + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "\t\t" + emp2.getYearlySalary() + "\t\t" + emp2.getMonthlySalary());
        
        System.out.println("\n*******************\n\n20 Percent Salary Raised\n");
        
        emp1.RaiseSalary(20);
        emp2.RaiseSalary(20);
        
        System.out.println("NAME               YEARLY SALARY        MONTHLY SALARY");
        System.out.println("----------------   --------------       --------------");    
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "\t\t" + emp1.getYearlySalary() + "\t\t" + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "\t\t" + emp2.getYearlySalary() + "\t\t" + emp2.getMonthlySalary());
    }
    
}
