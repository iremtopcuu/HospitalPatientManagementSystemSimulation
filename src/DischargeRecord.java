public class DischargeRecord {
    int patientId;//ID of the discharged patient
    long dischargeTime; // timestamp of discharge

    public DischargeRecord(int patientId,long dischargeTime) {
        this.patientId = patientId;
        this.dischargeTime=dischargeTime;

    }

    @Override
    public String toString() {
        return "PatientID: " + patientId + ", Time: " + dischargeTime;
    }
}
