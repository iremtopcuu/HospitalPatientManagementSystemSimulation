public class PatientList {
    Node head = null; //ilk düğüm
    Node tail = null; //son düğüm

    //add a new patient to the list
    void addPatient(Patient pt) {
        Node var = new Node(pt);
        if (head == null) { //if the list is empty
            head = var; //head and tail will be new node
            tail = var;
            System.out.println("Patient registration list created.");

        } else { //if the list is not empty
            tail.next = var;
            tail = var; //tail will be new node
            //System.out.println("The patient has been added.");

        }

    }

    //remove a patient by their ID
    void removePatient(int id) {
        if (head == null) { //if the list is empty
            System.out.println("The list is empty, there is no patient to delete.");
            return;
        } else {
            if (id == head.data.id && head.next == null) { //if the list has an element
                head = null;//the list is empty
                tail = null;
                System.out.println("Patient with ID  " + id + " has been deleted.");
                return;
            } else if (id == head.data.id && head.next != null) { //the list isn't empty
                head = head.next;
                System.out.println("Patient with ID " + id + " has been deleted.");
            } else { //if a middle or last node is to be removed
                Node temp = head;
                Node temp2 = head;
                while (temp.next != null) {  // travel to the end of the list
                    if (id == temp.data.id) { //if we find the searching ID
                        temp2.next = temp.next;
                        System.out.println("Patient with ID  " + id + " has been deleted.");
                        return;
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (id == temp.data.id) { //control the last node
                    temp2.next = null; //remove the last node
                    tail = temp2; // update tail
                    System.out.println("Patient with ID " + id + " has been deleted.");
                    return;
                }
                else{
                    System.out.println("Patient not found"); // we do not find ID
                    return;
                }
            }
        }


    }


    public void findPatient(int id) {  //search for a patient by ID and return the object.
        Node temp = head;
        while (temp != null) {
            if (temp.data.id == id) {
                System.out.println("Name:  " + temp.data.name + " Severity: " + temp.data.severity + " Age:  " + temp.data.age );
                return;
            } temp = temp.next;
            }System.out.println("the patient not found!");

        }

        //print all list
    void printList(){

        if(head==null){ //if the list is empty
            System.out.println("The list is empty");
            return;
        }else{
            Node temp=head;
            while (temp!=null){
                System.out.println("\n ID: " +temp.data.id); //ıd
                System.out.println("Name: " +temp.data.name);//name
                System.out.println("Severity: " + temp.data.severity);//severity
                System.out.println("Age:  " + temp.data.age);//age
                temp=temp.next;

            }
        }
    }





}




