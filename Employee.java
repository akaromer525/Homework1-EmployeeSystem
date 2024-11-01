
package employeehomework;

public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Employee(String firstName, String lastName, double monthlySalary) {
    
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    
    }
    
    public String getFirstName (){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName (){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public double getMonthlySalary (){
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }
    
    public double getYearlySalary (){
        return monthlySalary*12;
    }
    
    // if percent is 10
    // 10/100 = 0.1
    // 0.1*200 = 20
    // 200+20 = 220
    public void RaiseSalary (double Percent){
        if (Percent>0){
            monthlySalary = monthlySalary + (monthlySalary*(Percent/100));
        }
    }
    


    
    
}
