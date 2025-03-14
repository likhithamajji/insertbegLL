class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
        next=null;
    }
}
class LLB{
    public static node head;
    public static void addbegin(int num){
        node newnode=new node(num);
if(head==null){
    head=newnode;
    return;
}else{
newnode.next=head;
head=newnode;
    }
}
public static void display(){
    node temp=head;
    if(head==null){
        System.out.print("no linkedlist");
        return;
    }
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.print("null");
}
}
class insertionbeginsl{
    public static void main(String[] args) {
        LLB.addbegin(1);
        LLB.addbegin(2);
        LLB.addbegin(3);
        LLB.addbegin(4);
        LLB.addbegin(5);
        LLB.addbegin(6);
        LLB.display();
    }
}