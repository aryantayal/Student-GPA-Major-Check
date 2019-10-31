public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student(String n, String m, double g) {
        name = n;
        major = m;
        gpa = g;
    }

    public void print() {
        System.out.println(name + " " + major + " " + gpa);
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }
}