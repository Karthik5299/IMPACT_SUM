public class day15 {
    Node head=null;
private int size;
day15(){
    this.size=0;
}
class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
        size++;
    }
}
//insertion at beggining
public  void addbeg(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
        
    }
    newNode.next=head;
    head=newNode;
}
// insertion at last
public void addlast(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;
}
// insertion at certain position
public void addmid(int data , int position  ){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node temp=head;
    int currNode=0;
    while (temp!=null && currNode<position-1 ) {
        temp=temp.next;
        currNode++;
        
    }
    newNode.next=temp.next;
    temp.next=newNode; 
}
//deletion at beggining
public void deletebeg(){
    if(head==null){
        return;
    }
    size--;
    head=head.next;
}
// deletion at endding
public void deleteend(){
    if(head==null){
        return;
    }
    if(head.next==null){
        head=null;
        return;
    }
    size--;
    Node secoundlast=head;
    Node lastNode=head.next;
    while (lastNode.next!=null) {
        lastNode=lastNode.next;
        secoundlast=secoundlast.next;
    }
    secoundlast.next=null;

}
// Display
public void print(){
    if(head==null){
        return;
    }
    Node currNode=head;
    while (currNode!=null) {
        System.out.print(currNode.data + "--> ");
        currNode=currNode.next;
        
    }
    System.out.println("null");
}
public int getsize(){
    return size; 
}
public void reverseIterate(){
    if(head==null || head.next==null){
        return;
    }
     Node prevNode= head;
     Node currNode= prevNode.next;
     while (currNode!=null) {
        Node nextNode=currNode.next;
        currNode.next=prevNode;

        prevNode=currNode;
        currNode=nextNode;
        
     }
     head.next=null;
     head=prevNode;
}
public static void main(String[] args) {
    day15 obj = new day15();
    obj.addbeg(1);
    obj.addbeg(2);  
    obj.addbeg(3);
    obj.addbeg(4);
    obj.addlast(5);
    obj.print();
    obj.addmid(6,3);
    obj.print();
    obj.deletebeg();
    obj.print();
    obj.deleteend();
    obj.print();
    System.out.println(obj.getsize());
    obj.reverseIterate();
    obj.print();
    
}
}

