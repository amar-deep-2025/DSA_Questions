// Without changing connections
public class ReverseList{
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }


    }
    public static void display(Node a){
        while (a!=null){
            System.out.print(a.val+"->");
            a=a.next;

        }
        System.out.print("null");
    }
    public static void rec_display(Node a){
        if (a==null) return;
        rec_display(a.next);
        System.out.print(a.val+"->");
       
    }
    
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(9);
        Node f=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(b.next.val);
        System.out.println(c.val);
        System.out.println("____________________________________");
        System.out.println("             Original Linked List       ");
        display(a);
        System.out.println("");
        System.out.println("____________________________________");
        System.out.println("             Reverse Linked List            ");
        rec_display(a);
        System.out.print("null");
    }
}