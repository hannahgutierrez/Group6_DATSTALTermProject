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

    @Override
    public T front() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }

    @Override
    public T back() {
        if (isEmpty()) {
            return null;
        }
        return queue[back];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return count == queueCapacity;
    }

}
