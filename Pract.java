import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Student{
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId(){
        return id;
    }

    public double getGpa(){
        return gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    @Override public String toString(){
        return "ID: " + id + ", " + "Name: " + name + ", " +"GPA: " + gpa;
    }

}

public class Pract {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Map<Integer, Student> studentMap = new HashMap<>();

        Student s1 = new Student(101, "Aristo", 9.2);
        Student s2 = new Student(102, "Paul", 9.5);
        Student s3 = new Student(103, "Ace", 9.7);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
        studentMap.put(s3.getId(), s3);

        System.out.println("--- Display using ArrayList Iterator ---");
        Iterator<Student> listIterator = studentList.iterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("--- Display using HashMap Iterator ---");
        Iterator<Map.Entry<Integer, Student>> mapIterator = studentMap.entrySet().iterator();

        while (mapIterator.hasNext()) {
            Map.Entry<Integer, Student> entry = mapIterator.next();
            System.out.println(entry.getValue());
        }

        int searchId = 102;
        System.out.println("--- Searching ---");

        if(studentMap.containsKey(searchId)){
            System.out.println("Found in map" + studentMap.get(searchId));
        }
        else{
            System.out.println("Not found");
        }

        int updateId = 103;
        System.out.println("--- Update ---");

        if(studentMap.containsKey(updateId)){
            Student updaStudent = studentMap.get(updateId);
            updaStudent.setGpa(7.2);
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
