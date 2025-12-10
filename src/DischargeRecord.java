public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId,long dischargeTime) {
        this.patientId = patientId;
        this.dischargeTime=dischargeTime;

    }

    @Override
    public String toString() {
        return "PatientID: " + patientId + ", Time: " + dischargeTime;
    }
}
