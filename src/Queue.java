import java.util.Arrays;

/**
 * Created by Siddhesh on 2/7/2017.
 */
public class Queue {
    private int front;
    private int size;
    private int[] data;

    public Queue() {
        data = new int[6];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int n) {
        if (size == data.length)
            return;
        int pos = (front + size) % data.length;
        data[pos] = n;
        size++;
    }

    public int dequeue() {
        if (isEmpty())
            return -1;
        int val = data[front];
        data[front] = -1;
        front = (front + 1) % data.length;
        size--;
        return val;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return data[front];
    }

    public String toString() {
        return Arrays.toString(data);
    }
}
