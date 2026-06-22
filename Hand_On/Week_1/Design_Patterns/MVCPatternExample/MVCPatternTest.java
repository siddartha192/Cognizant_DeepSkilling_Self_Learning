public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("Siddhu", 101, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        System.out.println("Install Details");
        controller.updateView();
        System.out.println();
        controller.setStudentGrade("A+");
        System.out.println("After updating ");
        controller.updateView();
    }
}
