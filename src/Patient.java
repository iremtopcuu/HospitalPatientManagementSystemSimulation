public class Patient {
     int id; //  Unique identifier for each patient
    String name; // Patient’s full name
    int severity; // Severity level of illness (1–10)
    int age;  // Patient’s age

    public Patient(int id, String name,int severity, int age) {
        this.id = id;
        this.name=name;
        this.severity=severity;
        this.age=age;
    }
}
