public class TreatmentRequest {
    int patientId;
    long arrivalTime ;
    boolean priority;
    TreatmentRequest next;

    public TreatmentRequest(int patientId ,long arrivalTime) {
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
    }

    public TreatmentRequest(int patientId, boolean priority) {
        this.patientId=patientId;
        this.priority=priority;
        this.next=null;

    }

    public String toString() {
            return "PatientID: " + patientId +
                    ", ArrivalTime: " + arrivalTime;
        }
    }


