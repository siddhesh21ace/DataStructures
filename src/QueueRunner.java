/**
 * Created by Siddhesh on 2/7/2017.
 */
public class QueueRunner {
    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        System.out.println("Queue Size : " + q.getSize());
        System.out.println("Queue : " + q);

        int n = q.dequeue();

        System.out.println("Removed element is : " + n);
        System.out.println("Queue Size : " + q.getSize());

        System.out.println("Queue : " + q);

        q.enqueue(70);

        System.out.println("Queue Size : " + q.getSize());
        System.out.println("Queue : " + q);
    }
}
