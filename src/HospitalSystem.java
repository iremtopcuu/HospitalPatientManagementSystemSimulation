import java.util.*;
public class HospitalSystem {
private  PatientList patientList; // for admitted patients
private  TreatmentQueue treatmentQueue; // for waiting patients
private DischargeStack dischargeStack; // for processed discharges
private  HashMap<Integer,Patient> patientMap; // for quick patients lookups

    public HospitalSystem() { //this is constructor
        patientList=new PatientList();
        treatmentQueue=new TreatmentQueue();
        dischargeStack=new DischargeStack();
        patientMap=new HashMap<>();
    }
    public  void addNewPatient(Patient patient){ //add a new patient
        patientList.addPatient(patient);
        patientMap.put(patient.id,patient);//HashMape hızlı erişim için
        System.out.println("New patient added>>  ID: " + patient.id + "Name: " + patient.name);
    }
    public void addTreatmentRequest(int patientId){ //  add a treatment request
        TreatmentRequest request= new TreatmentRequest(patientId);
        treatmentQueue.enqueue(request);

    }
    public void addDischargeRecord(DischargeRecord record){ //add a discharge record to the stack
        dischargeStack.push(record);
    }
    public void processTreatment(){ //process a treatment request
        TreatmentRequest request=treatmentQueue.dequeue();
        if(request!=null){
            DischargeRecord record=new DischargeRecord(request.patientId,System.currentTimeMillis());
            dischargeStack.push(record);
        }
    }
    public void printSystem(){
        System.out.println("PATIENTS: ");
        patientList.printList();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("TREATMENT QUEUE: ");
        treatmentQueue.printQueue();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("DISCHARGE STACK: ");
        dischargeStack.printStack();

    }
}
