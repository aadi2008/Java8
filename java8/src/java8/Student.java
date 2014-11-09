package java8;
import java.util.function.Function;
public class Student {
    public int age;
    public String gender;
    public String name;
    public Student(int age,String gender){
        this.age = age;
        this.gender = gender;
    }
    public  String customShow(Function<Student,String> fun){
        return fun.apply(this);
    }
    public void printData(){
        System.out.println("Name:"+name + " age:"+age);
        System.out.println("This is for testing");
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

}
