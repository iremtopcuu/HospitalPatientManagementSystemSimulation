public class PatientList {
    Node head = null;
    Node tail = null;

    void addPatient(Patient pt) {
        Node var = new Node(pt);
        if (head == null) {
            head = var;
            tail = var;
            System.out.println("Patient registration list created.");

        } else {
            tail.next = var;
            tail = var;
            System.out.println("The patient has been added.");

        }

    }

    void removePatient(int id) {
        if (head == null) {
            System.out.println("The list is empty, there is no patient to delete.");
            return;
        } else {
            if (id == head.data.id && head.next == null) {
                head = null;
                tail = null;
                System.out.println("Patient with ID  " + id + " has been deleted.");
                return;
            } else if (id == head.data.id && head.next != null) {
                head = head.next;
                System.out.println("Patient with ID " + id + " has been deleted.");
            } else {
                Node temp = head, temp2 = head;
                while (temp.next != null) {
                    if (id == temp.data.id) {
                        temp2.next = temp.next;
                        System.out.println("Patient with ID  " + id + " has been deleted.");
                        return;
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (id == temp.data.id) {
                    temp2.next = null;
                    tail = temp2;
                    System.out.println("Patient with ID " + id + " has been deleted.");
                    return;
                }
                else{
                    System.out.println("Patient not found");
                    return;
                }
            }
        }


    }

    public boolean findPatient(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.id == id) {
                return true;
            } temp = temp.next;
            }
            return false;
        }

    void printList(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }else{
            Node temp=head;
            while (temp!=null){
                System.out.println("\n ID: " +temp.data.id);
                System.out.println("Name: " +temp.data.name);
                System.out.println("Severity: " + temp.data.severity);
                System.out.println("Age:  " + temp.data.age);
                temp=temp.next;

            }
        }
    }





}




