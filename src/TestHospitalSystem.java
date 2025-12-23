public class TestHospitalSystem {
    public static void main(String[] args){
        HospitalSystem hs=new HospitalSystem(); //create hospital system
        hs.addNewPatient(new Patient(10,"İrem Topcu ",1,22));
        hs.addNewPatient(new Patient(20,"Ceren Topcu",2,18));
        hs.addNewPatient(new Patient(30,"Nazlı Bayram",5,75));
        hs.addNewPatient(new Patient(40,"Oğuzhan Yıldırım",3,23));
        hs.addNewPatient(new Patient(50,"Rana Narin",7,30));
        hs.addNewPatient(new Patient(60,"Emre Bıkmaz ", 9,45));
        hs.addNewPatient(new Patient(70,"Rumeysa Delican",6,8));
        hs.addNewPatient(new Patient(80,"Rabia Acer",4,37));
        hs.addNewPatient(new Patient(90,"Tuğba ALkoç",5,19));
        hs.addNewPatient(new Patient(100,"Talha Mete Deveci",6,25));

        hs.addTreatmentRequest(10,false); //tedavi taleplerini ekle priority=öncelikli true
        hs.addTreatmentRequest(50,false);
        hs.addTreatmentRequest(40,false);
        hs.addTreatmentRequest(60,true);
        hs.addTreatmentRequest(90,true);
        hs.addTreatmentRequest(80,false);
        hs.addTreatmentRequest(70,true);
        hs.addTreatmentRequest(20,false);

        hs.addDischargeRecord(new DischargeRecord(30,System.currentTimeMillis())); //taburcu kayıtları
        hs.addDischargeRecord(new DischargeRecord(80,System.currentTimeMillis()));

        hs.processTreatment();// // process treatment requests (priority first) Tedavi taleplerini işle (öncelikli olanlar önce)”
        hs.processTreatment();
        hs.processTreatment();;
        hs.processTreatment();

        hs.printSystem();

        hs.sortBySeverity();
        System.out.println("\n Patients sorted by their severity: ");
        hs.patientList.printList();













    }
}
