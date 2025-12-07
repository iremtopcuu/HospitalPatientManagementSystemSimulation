public class TestQueue {

    public static void main(String[] args) {

        TreatmentQueue queue = new TreatmentQueue();

        // Add 8 treatment requests.
        queue.enqueue(new TreatmentRequest(10, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(20, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(30, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(40, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(50, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(60, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(70, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(80, System.currentTimeMillis()));

        System.out.println("---  8 treatment requests are added  ---");
        queue.printQueue();

        //  dequeue 3 requests.
        System.out.println("\n---  dequeue 3 requests.  ---");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("\n--- remaining queue ---");
        queue.printQueue();
    }
}

