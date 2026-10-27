public class Queue<T> implements QueueInterface<T> {
    private final T[] queue;
    private int front;
    private int back;
    private int count;
    private final int queueCapacity;

    //Constructor
    public Queue(int queueCapacity) {
        this.queueCapacity = queueCapacity;
        this.queue = (T[]) new Object[queueCapacity];
        this.front = 0;
        this.back = -1;
        this.count = 0;
    }

}
