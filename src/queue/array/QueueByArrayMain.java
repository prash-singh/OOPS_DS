package queue.array;

public class QueueByArrayMain {
    public static void main(String[] args) {
        QueueByArray obj = new QueueByArray();
        obj.insert(5);
        obj.enQueue(10);
        obj.enQueue(20);
        obj.enQueue(30);
        obj.enQueue(40);
        obj.enQueue(50);

        obj.deQueue();
        obj.displayQueue();
    }
}
