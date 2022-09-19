import java.util.*;


public class LL {
    Node head;

    public class Node {
        String data;

        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void addLast(){
        
    }

    public void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        } 
        System.out.println("null");   
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("list");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        
        list.printList();
    }
}
