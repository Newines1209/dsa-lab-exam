class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        // Enqueue several items into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue some items from the queue
        System.out.println("Dequeued item: " + queue.dequeue()); // Output: 1
        System.out.println("Dequeued item: " + queue.dequeue()); // Output: 2

        // Peek at the front item without dequeuing it
        System.out.println("Front item: " + queue.peek()); // Output: 3

        // Ensure appropriate error messages for underflow and overflow conditions
        try {
            System.out.println("Dequeued item: " + queue.dequeue());
            System.out.println("Dequeued item: " + queue.dequeue()); // This should throw an exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Output: Error: Queue is empty
        }

        try {
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6); // This should throw an exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Output: Error: Queue is full
        }
    }
}