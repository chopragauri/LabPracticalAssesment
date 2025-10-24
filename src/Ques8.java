import java.util.*;
class Employe{
    String employeeName;
    String department;
    Integer id;

    Employe(String employeeName, String department, Integer id) {
        this.employeeName = employeeName;
        this.department = department;
        this.id = id;
    }

}
class Company{
    ArrayList<String> employeeNames=new ArrayList<>();
    HashSet<String> departments= new HashSet<>();
    HashMap<Integer,String> employeeMap= new HashMap<>();

    void addDetails(Employe employee){
        employeeNames.add(employee.employeeName);
        departments.add(employee.department);
        employeeMap.put(employee.id, employee.employeeName);
    }

    void display(){
        System.out.println("Employee Names: "+ employeeNames);
        System.out.println("Departments: "+ departments);
        System.out.println("Id-Name Mapping "+ employeeMap);
    }
}
public class Ques8 {
    public static void main(String[] args) {
        Company company = new Company();
        company.addDetails(new Employe("Gauri", "Ai", 38));
        company.addDetails(new Employe("Abhishek", "Java Development", 62));
        company.display();
}
}