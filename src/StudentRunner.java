public class StudentRunner {
    public static void main(String[] args) {
        Student j = new Student("Jason", 64);
        j.helloThere();
        j.myGPA();
        j.setName("Johnson");
        j.setGpa(85.56);
        j.myGPA();
        j.helloThere();
    }
}
