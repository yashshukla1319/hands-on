class LinkNode{
    LinkNode next;
    int data;
    LinkNode(int d){
        data = d;
        next = null;
    }
}
public class LinkedList {
    static LinkNode head;
    LinkNode reverselist(LinkNode node){
        java.util.LinkedList<Integer> list = new java.util.LinkedList();
        LinkNode prev = null;
        LinkNode current = node;
        LinkNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public void printList(LinkNode node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new LinkNode(85);
        list.head.next = new LinkNode(15);
        list.head.next.next = new LinkNode(4);
        list.head.next.next.next = new LinkNode(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverselist(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}