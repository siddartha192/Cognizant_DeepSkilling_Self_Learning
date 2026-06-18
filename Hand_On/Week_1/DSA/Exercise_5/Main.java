public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        taskList.addTask(new Task(1,"Design Database","Pending"));
        taskList.addTask(new Task(2,"Backend Develop","In Progress"));
        taskList.addTask(new Task(3,"Testing","Pending"));
        taskList.addTask(new Task(4,"Develop","In Progress"));
        System.out.println("All Tasks: ");
        taskList.displayTasks();
        System.out.println("\nSearch Task 2: ");
        System.out.println(taskList.searchTask(2));
        taskList.deleteTask(2);
        System.out.println("\nAfter Deleting Task 2");
        taskList.displayTasks();

    }
}
