package queue;

public class Main {

    public static void main(String[] args){

        Queue myQueue=new Queue(2);

     //   myQueue.getFirst();
      //  myQueue.getLast();
        myQueue.enqueue(1);
        myQueue.dequeue();
        myQueue.printQueue();
    }
}
