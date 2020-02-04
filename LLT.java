import java.util.*;

class LLT
{
    
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node head;
    void pushFront(int data)
    {
    Node newNode= new Node(data);

    if(head==null)
    {
        head=newNode;
        head.next=null;
        System.out.println("Node at the front is"+newNode.data);
    }
    else
    {
        
        newNode.next=head;
        head=newNode;
        System.out.println("Node at front now is "+newNode.data);

    }
    }
    void pushBack(int data)
    {
        Node newNode=new Node(data);
        if (head==null)
        {
            head=newNode;
            head.next=null;
            System.out.println("Node at the last is "+head.data);
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next =newNode;
            System.out.println("Node at last now is"+ newNode.data);
        }
    }
    void afterNode(Node tarNode, int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            System.out.println("The ll is empty");

        }
        else
        {
            newNode.next=tarNode.next;
            tarNode.next=newNode;

        }
    }
    void printList()
    {
        Node tnode=head;
        while(tnode.next!=null)
        {
            System.out.println(tnode.data+" ");
            tnode=tnode.next;
        }
        System.out.println(tnode.data);
    }
    void delF()
    {
        head=head.next;
    }
    void delE()
    {
        Node temp=head;
        while(true)
        {
            if(temp.next.next==null)
            {
                temp.next=null;
                break;
            }
            temp=temp.next;
        }

    }
    void delMid(Node tar)//deletes after a given node
    {
        tar.next=tar.next.next;

    }
    void dellist()//deleting a liked list
    {
        head=null;
    }
    void lecon()
    {
        int count=0;
        Node st=head;
        while(st.next!=null)
        {
            count++;
            st=st.next;
        }
        System.out.println(count+1+" ");
    }
    int leconrecur(Node st)
    {

        if (st==null)
        return 0;
        else
        return (1+leconrecur(st.next));
    }
    void reverse()
    {
        //This method reverses the linked list
        Node prev=null;
        Node curr=head;
        Node next=head.next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        head=prev;
    }
public static void main(String [] args)
 {
    LLT ob= new LLT();
    ob.pushBack(37);
    ob.pushBack(52);
    ob.pushBack(47);
    ob.pushFront(25);
    ob.pushFront(01);
    ob.afterNode(ob.head.next.next,69);
    ob.printList();
    System.out.println("after deleting first node");
    ob.delF();
    ob.printList();
    System.out.println("after deleting last node");
    ob.delE();
    ob.printList();
    System.out.println("after deleting middle element");
    ob.delMid(ob.head.next.next);
    ob.printList();
    System.out.println("The count is");
    ob.lecon();
    System.out.println("The count after recur is "+ob.leconrecur(ob.head));
    System.out.println("Now we reverse the linked list");
    ob.pushBack(37);
    ob.pushBack(52);
    ob.pushBack(47);
    ob.pushFront(25);
    ob.pushFront(01);
    System.out.println("This is the original linked list");
    ob.printList();
    ob.reverse();
    System.out.println("This is the reversed linked list");
    ob.printList();





    
}
}