public class PriorityTreatmentQueue {
    TreatmentQueue priorityQueue; //queue for emergency
    TreatmentQueue normalQueue;

    public PriorityTreatmentQueue() {
        priorityQueue=new TreatmentQueue();
        normalQueue=new TreatmentQueue();
    }
    void enqueue(TreatmentRequest request){ //add a treatment request to the correct queue
        if(request.priority){ //if patient emergency
            priorityQueue.enqueue(request);
        }else{ //normal patient
            normalQueue.enqueue(request);
        }
    }

    public TreatmentRequest dequeue(){
        TreatmentRequest r= priorityQueue.dequeue();//remove abd return next patient
        if(r!=null){
            return r ;
        }
        return normalQueue.dequeue();
    }
//print all treatment request
    public void printQueue(){
        System.out.println("Priority Queue: ");
        priorityQueue.printQueue();

        System.out.println("Normal Queue: ");
        normalQueue.printQueue();
    }
}
