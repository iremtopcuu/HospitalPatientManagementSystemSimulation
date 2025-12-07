public class TestQueue {

    public static void main(String[] args) {

        TreatmentQueue queue = new TreatmentQueue();

        // 8 tedavi isteği ekle
        queue.enqueue(new TreatmentRequest(10, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(20, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(30, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(40, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(50, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(60, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(70, System.currentTimeMillis()));
        queue.enqueue(new TreatmentRequest(80, System.currentTimeMillis()));

        System.out.println("--- Kuyruk (8 istek eklendi) ---");
        queue.printQueue();

        // 3 isteği işleme (dequeue)
        System.out.println("\n--- İşlenen 3 istek ---");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("\n--- Kalan Kuyruk ---");
        queue.printQueue();
    }
}

