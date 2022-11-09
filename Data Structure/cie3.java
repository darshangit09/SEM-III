import java.util.Scanner;
class DoublyLinkedList 
{    
    class Node
    {  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) 
        {  
            this.item = item;  
        }  
    }  
        Node head, tail = null;  
        
        public void addNode(int item) 
        {  
        Node newNode = new Node(item);  
        if(head == null) 
         {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
         }  
        else 
          {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
          }  
        }  
   
	public void printNodes() 
	{  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) 
        {  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
   class cie3
     {
    public static void main(String[] args)  
       {  
        DoublyLinkedList dl_List = new DoublyLinkedList();
        Scanner o= new Scanner(System.in); 
        for(int i=0;i<=5;i++)
         {
         
        int t;
        System.out.println("Enter the node to be Added:");
        t=o.nextInt();
        dl_List.addNode(t);
         
         }
         
        dl_List.printNodes(); 
    }  
}  
