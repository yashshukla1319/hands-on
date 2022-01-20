import java.util.HashSet;

//Remove duplicate from linked list
public class DupliInLList {
    static DupliInLList.Node head;

    public static void remove(Node head) {
        Node current = head;
        Node prev = null;
        HashSet<Integer> hs = new HashSet();
        while (current!=null){
            if (hs.contains(current.data)){
                prev.next = current.next;
            }
            else {
                hs.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    static class Node {
        int data;
        DupliInLList.Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args)
    {
        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before removing duplicates :");
        printList(start);

        remove(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }

}
