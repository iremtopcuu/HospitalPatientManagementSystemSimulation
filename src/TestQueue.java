public class TestQueue {

    public static void main(String[] args) {

        TreatmentQueue queue = new TreatmentQueue();

        // Add 8 treatment requests.
        TreatmentRequest r1 = new TreatmentRequest(10, System.currentTimeMillis());
        TreatmentRequest r2 = new TreatmentRequest(20, System.currentTimeMillis());
        TreatmentRequest r3 = new TreatmentRequest(30, System.currentTimeMillis());
        TreatmentRequest r4 = new TreatmentRequest(40, System.currentTimeMillis());
        TreatmentRequest r5 = new TreatmentRequest(50, System.currentTimeMillis());
        TreatmentRequest r6 = new TreatmentRequest(60, System.currentTimeMillis());
        TreatmentRequest r7 = new TreatmentRequest(70, System.currentTimeMillis());
        TreatmentRequest r8 = new TreatmentRequest(80, System.currentTimeMillis());

        System.out.println("---  8 treatment requests are added  ---");
        queue.enqueue(r1);
        queue.enqueue(r2);
        queue.enqueue(r3);
        queue.enqueue(r4);
        queue.enqueue(r5);
        queue.enqueue(r5);
        queue.enqueue(r6);
        queue.enqueue(r7);
        queue.enqueue(r8);
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

