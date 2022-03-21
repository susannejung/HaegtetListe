package FilEksempler;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node first,p,q;
        Node n=new Node(1);
        first=n;
        p=first;
        n=new Node(2);
        p.next=n;
        n=new Node(3);
        p=p.next;
        p.next=n;
        for(p=first;p!=null;p=p.next)
            System.out.print(p.tal+"  ");
        p=first;
        p=p.next;
        q=p.next;
        n=new Node(4);
        n.next=q;
        p.next=n;
        for(p=first;p!=null;p=p.next)
            System.out.print(p.tal+"  ");





    }
}
