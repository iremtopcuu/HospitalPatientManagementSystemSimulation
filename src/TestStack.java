public class TestStack {
    public static void main(String[] args){
        DischargeStack stack=new DischargeStack();

        DischargeRecord r1=new DischargeRecord(50,System.currentTimeMillis());
        DischargeRecord r2=new DischargeRecord(60,System.currentTimeMillis());
        DischargeRecord r3=new DischargeRecord(70,System.currentTimeMillis());
        DischargeRecord r4=new DischargeRecord(80,System.currentTimeMillis());
        DischargeRecord r5=new DischargeRecord(90,System.currentTimeMillis());

        stack.push(r1);
        stack.push(r2);
        stack.push(r3);
        stack.push(r4);
        stack.push(r5);
        stack.printStack();
        System.out.println("\n---- Popping 2 Records ----");
        stack.pop();
        stack.pop();
        System.out.println("2 records are removed. Remaining stack:\n");
        stack.printStack();




    }
}
