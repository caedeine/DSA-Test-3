package p1;

public class Demo1{
//    static int count = 0;
    public static void main(String[] args){
        int count = 1;
        message(count);
        System.out.println("Count:" + count); //we pass by value
        System.out.println("Bye");
    }
    public static void message(int c){
        System.out.println("H\t" + c);

        if (c >= 5){ // this is the BASECASE
            return;
        }
        message(++c);
        //message(c++) would cause an overflow forever
        //everytime you call message() you need a STACKFRAME

        //note that every time we create  a stack frame, it is just like  regular stack.
        // the last stack added is the first one removed. The program ends when all stackframes are removed.
        //it doesnt affect othe programs because we have a set amount of allocated memory for our program
    }

}
