class Snode{
    Snode next;
    int data;
    Snode(int d){
        data = d;
        next = null;
    }
}
public class SortLList {
    static Snode head;
    public void push(int new_data)
    {
        Snode new_node = new Snode(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void sort(){
        int temp;
        Snode head = null;
        Snode current = head;
        Snode nextnode = null;
        Snode next;
        if (head==null){
            return;
        }
        else {
            while (current == null) {
                nextnode = current.next;
                while (nextnode == null) {
                    if (current.data > nextnode.data) {
                        temp = current.data;
                        current.data = nextnode.data;
                        nextnode.data = temp;
                    }
                    nextnode = nextnode.next;
                }
                current = current.next;
            }
        }
    }
    public void printList(Snode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        SortLList list = new SortLList();
        list.push(85);
        list.push(15);
        list.push(4);
        list.push(20);
        list.sort();
        list.printList(head);

    }
}
