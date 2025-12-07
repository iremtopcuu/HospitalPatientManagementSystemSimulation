public class TreatmentRequest {
    int patientId;
    long arrivalTime ;

    public TreatmentRequest(int patientId ,long arrivalTime) {
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
    }
        public String toString() {
            return "PatientID: " + patientId +
                    ", ArrivalTime: " + arrivalTime;
        }
    }


