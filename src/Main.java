public class Main {

    public static void main(String[] args){
    PatientList list= new PatientList();
    list.addPatient(new Patient(10,"irem ", 1,22));
    list.addPatient(new Patient(20,"ceren", 2,18));
    list.addPatient(new Patient(30,"yusuf", 3,7));
    list.addPatient(new Patient(40,"oğuzhan", 4,23));
    list.addPatient(new Patient(50,"elif", 5,56));
    System.out.println("--------------------------------------------");

    list.removePatient(50);
    list.findPatient(30);
    System.out.println("    \n LİST       ");
    list.printList();


    }
}