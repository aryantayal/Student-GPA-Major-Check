public class Course {
    private Student[] roster;
    private int size;

    public Course(int capacity) {
        roster = new Student[capacity];
        size = 0;
    }

    public void addStudent(String name, String major, double gpa) {
        Student st = new Student(name, major, gpa);
        roster[size] = st;
        size++;
        //If the array is full, do nothing (don't add the student)
        //(Alternatively, you can resize the array if you want)
    }

    public void printStudentsWithMajor(String m) {
        for(int i = 0; i< roster.length; i++){
            if(roster[i].getMajor().equals(m)){
                roster[i].print();
            }
        }
    }

    public void printHonorRoll() {
        for(int i = 0; i< roster.length; i++){
            if(roster[i].getGPA() >= 3.5){
                roster[i].print();
            }
        }
    }
}