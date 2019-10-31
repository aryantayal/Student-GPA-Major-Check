import java.util.*;

public class Lab8 {
    public static void main(String[] args) {
        Course c = new Course(2);
        Scanner s = new Scanner(System.in);

        //YOU DO THIS
        //Create a Course object that can hold 10 students
        for (int i = 0; i<2; i++){
        System.out.print("Enter Name: ");
        String name = s.nextLine();
        System.out.print("Enter Major: ");
        String major = s.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(s.nextLine());
        c.addStudent(name,major,gpa);
        }

        System.out.print("Enter a major: ");
        String major = s.nextLine();
        c.printStudentsWithMajor(major);
        c.printHonorRoll();
        //Ask the user to enter a major
        //Call a method in Course to print all students with that major

        //Print all student's on the honor roll (by calling a method in Course
    }
}