package algorithm.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue myQueue = new Queue(7);
        myQueue.enqueue(8);
        myQueue.dequeue();

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
