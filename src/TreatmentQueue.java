public class TreatmentQueue {

    private class Node {
        TreatmentRequest data;
        Node next;

        Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }
     Node rear; // son eleman
     Node front; //ilk eleman
     int count=0;

    public void enqueue(TreatmentRequest request){ // add a new treatment request to the queue
        Node var= new Node(request);
        if(front==null){
            front=var;;
            rear=var;
            return;
        } else {
            rear.next=var;
            rear=var;
        }
    }

    public TreatmentRequest dequeue(){ // remove
        if(front==null) {
            System.out.println("Queue is empty");
            return null;
        }
        TreatmentRequest result = front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }

        return result;
    }


    public int size() { // return the number of requests.
        Node temp=front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void  printQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;

            }
        }
    }


}
