abstract class Employee{
    String name;
    int EmployeeId;

     Employee(String name, int EmployeeId){
         this.name = name;
         this.EmployeeId = EmployeeId;
     }

     void calculateSalary(){
         System.out.println("Employee type(Permanent/Contractual) not defined");
     }
}
class PermanentEmployee extends Employee{
    double baseSalary;
    double bonus;

    PermanentEmployee(String name, int EmployeeId, double baseSalary, double bonus){
        super(name, EmployeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        baseSalary = baseSalary + bonus;
        System.out.println("Employee Salary: " + baseSalary);
    }
}
class ContractualEmployee extends Employee{
    double hoursWorked;
    double perHourWage;
    double salary;
    ContractualEmployee(String name, int EmployeeId, double hoursWorked, double perHourWage){
        super(name, EmployeeId);
        this.hoursWorked = hoursWorked;
        this.perHourWage = perHourWage;
    }

    @Override
    void calculateSalary() {
        salary = hoursWorked * perHourWage;
        System.out.println("Employee Salary: " + salary);
    }
}

public class Q2 {
    public static void main(String[] args){
        Employee e1 = new PermanentEmployee("Jadon", 312,100000,10);
        e1.calculateSalary();
        Employee e2 = new ContractualEmployee("Abhishek Dixit", 612,15,10000);
        e2.calculateSalary();
    }
}
