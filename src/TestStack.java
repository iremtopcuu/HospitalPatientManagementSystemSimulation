public class TestStack {
    public static void main(String[] args){
        DischargeStack stack=new DischargeStack();

        DischargeRecord r1=new DischargeRecord(50,System.currentTimeMillis());
        DischargeRecord r2=new DischargeRecord(60,System.currentTimeMillis());
        DischargeRecord r3=new DischargeRecord(70,System.currentTimeMillis());
        DischargeRecord r4=new DischargeRecord(80,System.currentTimeMillis());
        DischargeRecord r5=new DischargeRecord(90,System.currentTimeMillis());

        System.out.println("---- adding 5 records ----");
        stack.push(r1);
        stack.push(r2);
        stack.push(r3);
        stack.push(r4);
        stack.push(r5);
        stack.printStack();
        System.out.println("\n---- popping 2 records ----");
        stack.pop();
        stack.pop();

        stack.peek();

        System.out.println("\n -----2 records removed. remaining stack:-----");
        stack.printStack();




    }
}
