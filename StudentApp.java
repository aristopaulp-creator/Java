import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Student class representing individual records
class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        // Using Generics <Student> with ArrayList for sequential storage
        List<Student> studentList = new ArrayList<>();
        
        // Using Generics <Integer, Student> with HashMap for fast ID-based lookup
        Map<Integer, Student> studentMap = new HashMap<>();

        // 1. CREATE / ADD Elements
        Student s1 = new Student(101, "Alice", 9.8);
        Student s2 = new Student(102, "Bob", 9.4);
        Student s3 = new Student(103, "Charlie", .9);

        // Add to ArrayList
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // Add to Map (Key: Student ID, Value: Student Object)
        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
        studentMap.put(s3.getId(), s3);

        // 2. DISPLAY using Iterators
        System.out.println("--- Displaying Students via ArrayList Iterator ---");
        Iterator<Student> listIterator = studentList.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\n--- Displaying Students via Map EntrySet Iterator ---");
        Iterator<Map.Entry<Integer, Student>> mapIterator = studentMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, Student> entry = mapIterator.next();
            System.out.println("Key-> " + entry.getKey() + " Value-> " + entry.getValue());
        }

        // 3. SEARCH Operation
        int searchId = 102;
        System.out.println("\n--- Searching for Student ID: " + searchId + " ---");
        if (studentMap.containsKey(searchId)) {
            System.out.println("Found in Map: " + studentMap.get(searchId));
        } else {
            System.out.println("Student not found.");
        }

        // 4. UPDATE Operation
        int updateId = 101;
        System.out.println("\n--- Updating GPA for Student ID: " + updateId + " ---");
        if (studentMap.containsKey(updateId)) {
            Student targetStudent = studentMap.get(updateId);
            targetStudent.setGpa(4.0); // Update object state
            
            // Reflect change in ArrayList if needed (searching list via iterator/loop)
            for (Student s : studentList) {
                if (s.getId() == updateId) {
                    s.setGpa(4.0);
                }
            }
            System.out.println("Updated Record: " + studentMap.get(updateId));
        }
    }
}
