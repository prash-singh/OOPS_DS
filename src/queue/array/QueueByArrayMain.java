package queue.array;

public class QueueByArrayMain {
    public static void main(String[] args) {
        QueueByArray obj = new QueueByArray();
        obj.insert(5);
        obj.enQueue(0);
        obj.enQueue(0);
        obj.enQueue(0);
        obj.enQueue(0);
        obj.enQueue(0);

        obj.deQueue();
        obj.displayQueue();
    }
}
