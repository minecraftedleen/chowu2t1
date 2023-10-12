public class Student {

    private String name;
    private double gpa;

    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public void helloThere() {
        System.out.println("Hello! My name is " + name);
    }

    public void myGPA() {
        System.out.print("My GPA is " + gpa);
        if (gpa < 65) {
            System.out.println("That's not good");
        } else {
            System.out.println("Im currently passing");
        }
    }

}
