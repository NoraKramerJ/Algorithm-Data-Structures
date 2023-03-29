package stack;

public class Main {

    public static void main(String[] args){

        Stack mystack=new Stack(7);

      //  mystack.getTop();
      //  mystack.getHeight();

        mystack.push(23);
        mystack.push(3);
        mystack.push(11);

        mystack.pop();
        mystack.printStack();

    }
}
