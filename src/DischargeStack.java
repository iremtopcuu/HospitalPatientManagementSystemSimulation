public class DischargeStack {
    private class Node {
        DischargeRecord data;
        Node next;

        Node(DischargeRecord data) {
            this.data=data;
            this.next=null;
        }
    }
    Node top = null;//en üst düğümü tutan gösterici
    int count=0;

    public void push(DischargeRecord record){
        Node var=new Node(record);
        if(top==null){
            top=var;
            return;
        }else{
            var.next=top;
            top=var;

        }
    } //Add a discharge record

    public DischargeRecord pop(){  //Remove and return the top record.
        if(top==null){
            System.out.println("Stack is empty!");
            return null;
        }else{
            top=top.next;
            return top.data;
        }
    }

    public void peek(){
        if(top==null){
            System.out.println("stack is empty!");
        }else{
            System.out.println("the most recent discharge:" + top.data);
        }
    }

    public void printStack() {
        if (top == null) {
            System.out.println("stack is empty!");
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }


    }


}