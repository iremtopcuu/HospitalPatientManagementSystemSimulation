import java.util.*;
public class HospitalSystem {
public   PatientList patientList; // for admitted patients
public  PriorityTreatmentQueue treatmentQueue; // for waiting patients
public DischargeStack dischargeStack; // for processed discharges
public  HashMap<Integer,Patient> patientMap; // for quick patients lookups

    public HospitalSystem() { //this is constructor
        patientList=new PatientList();
        treatmentQueue=new PriorityTreatmentQueue();
        dischargeStack=new DischargeStack();
        patientMap=new HashMap<>();
    }
    public  void addNewPatient(Patient patient){ //add a new patient
        patientList.addPatient(patient);
        patientMap.put(patient.id,patient);//HashMape hızlı erişim için
        System.out.println("New patient added>>  ID: " + patient.id + " Name: " + patient.name);
    }
    public void addTreatmentRequest(int patientId,boolean priority){//  add a treatment request
        if(!patientMap.containsKey(patientId)){
            System.out.println("Patient not found ");
            return;

        }
        TreatmentRequest request= new TreatmentRequest(patientId,priority);
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
    public void sortBySeverity() {
        if (patientList.head == null || patientList.head.next == null) return; // boş veya tek eleman

        boolean swapped;
        do {
            swapped = false;
            Node current = patientList.head;
            while (current.next != null) {
                if (current.data.severity < current.next.data.severity) {
                    // swap patient objelerini
                    Patient temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }



    public void printSystem(){ //print all
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
