public class TaskLinkedList {
    class Node{
        Task task;
        Node next;
        Node(Task task){
            this.task = task;
            this.next = null;
        }
    }
    private Node head;
    public void addTask(Task task){
        Node newNode = new Node(task);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public Task searchTask(int id){
        Node temp = head;
        while(temp != null){
            if(temp.task.getTaskId() == id){
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }
    public void displayTasks(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(int id){
        if(head == null) return;
        if(head.task.getTaskId() == id){
            head = head.next;
            return;
        }
        Node curr = head;
        while(curr.next != null && curr.next.task.getTaskId() != id){
            curr = curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
        }
    }
}
