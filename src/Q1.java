class Student{
    int id;
    String name;
    String course;

    Student(){
        name= "Undefined";
        course="btech";
        id=0;
    }

    Student(int id,String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }

    void getDetails(){
        System.out.println("\n id:"+id+",name:"+name+",course:"+course);
    }
}

class GraduateStudent extends Student{
String specialisation;

GraduateStudent(int id,String name,String course, String specialisation){
    super(id,name,course);
    this.specialisation=specialisation;
}

@Override
void getDetails(){
    super.getDetails();
    System.out.println("specialisation:"+specialisation);
}

}
public class Q1 {
public static void main(String[] args){
    Student s1= new GraduateStudent(38,"Gauri Chopra","B-Tech","AI");
    Student s2= new GraduateStudent(6,"Abhishek Dixit","M-Tech","Java");
    Student s3 = new Student();
    s1.getDetails();
    s2.getDetails();
    s3.getDetails();
}
}
