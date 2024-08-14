import java.util.Scanner;

// Stack interface
interface Stack {
    void push(int Selement);
    void pop();
    void displays();
}

// Queue interface
interface Queue {
    void Enqueue(int Qelement);
    void Dequeue();
    void displayq();
}

// Combined Stack and Queue implementation
class SQ implements Stack, Queue {
    int top = -1;
    int front = -1, rear = -1;
    int maxsize;
    int[] arr;

    SQ(int maxsize) {
        this.maxsize = maxsize;
        arr = new int[maxsize];  // Initialize the array
    }

    // Stack methods
    @Override
    public void push(int Selement) {
        if (top == maxsize - 1) {
            System.out.println("STACK IS OVERFLOW COULD NOT PUSH ELEMENT");
        } else {
            top++;
            arr[top] = Selement;
            System.out.println("ELEMENT PUSH SUCCESSFULLY");
        }
    }

    @Override
    public void pop() {
        if (top == -1) {
            System.out.println("STACK IS UNDERFLOW COULD NOT POP ELEMENT");
        } else {
            System.out.println("ELEMENT POP SUCCESSFULLY ");
            System.out.println("POPED ELEMENT IS :-" + arr[top]);
            top--;
        }
    }

    @Override
    public void displays() {
        System.out.println("STACK ELEMENT IS:-");
        for (int i = 0; i <= top; i++) {
            System.out.println(" " + arr[i]);
        }
    }

    // Queue methods
    @Override
    public void Enqueue(int Qelement) {
        if (rear == maxsize - 1) {
            System.out.println("QUEUE IS OVERFLOW COULD NOT INSERT ELEMENT");
        } else {
            if (front == -1 && rear == -1) {
                front = rear = 0;
            } else {
                rear++;
            }
            arr[rear] = Qelement;
            System.out.println("ELEMENT INSERT SUCCESSFULLY");
        }
    }

    @Override
    public void Dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("QUEUE IS UNDERFLOW COULD NOT DELETE ELEMENT");
        } else {
            System.out.println("ELEMENT DELETE SUCCESSFULLY ");
            System.out.println("DELETED ELEMENT IS :-" + arr[front]);
            front++;
        }
    }

    @Override
    public void displayq() {
        System.out.println("QUEUE ELEMENT IS:-");
        if (front == -1 || front > rear) {
            System.out.println("QUEUE IS EMPTY");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(" " + arr[i]);
            }
        }
    }
}

// Main class
public class StackQueue {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int flag1 = 0;

        while (flag1 == 0) {
            System.out.println("1.STACK\n2.QUEUE\n3.EXIT");
            int b = a.nextInt();
            switch (b) {
                case 1:
                    System.out.println("ENTER THE MAXSIZE FOR STACK");
                    int maxsizeStack = a.nextInt();
                    SQ stack = new SQ(maxsizeStack);
                    int flag2 = 0;
                    while (flag2 == 0) {
                        System.out.println("1.push\n2.pop\n3.display\n4.exit");
                        int c = a.nextInt();
                        switch (c) {
                            case 1:
                                System.out.println("ENTER THE ELEMENT TO PUSH");
                                int e = a.nextInt();
                                stack.push(e);
                                break;
                            case 2:
                                stack.pop();
                                break;
                            case 3:
                                stack.displays();
                                break;
                            case 4:
                                flag2 = 1;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("ENTER THE MAXSIZE FOR QUEUE");
                    int maxsizeQueue = a.nextInt();
                    SQ queue = new SQ(maxsizeQueue);
                    int flag3 = 0;
                    while (flag3 == 0) {
                        System.out.println("1.Enqueue\n2.Dequeue\n3.display\n4.exit");
                        int c = a.nextInt();
                        switch (c) {
                            case 1:
                                System.out.println("ENTER THE ELEMENT TO ENQUEUE");
                                int e = a.nextInt();
                                queue.Enqueue(e);
                                break;
                            case 2:
                                queue.Dequeue();
                                break;
                            case 3:
                                queue.displayq();
                                break;
                            case 4:
                                flag3 = 1;
                                break;
                        }
                    }
                    break;
                case 3:
                    flag1 = 1;
                    break;
            }
        }

        a.close();
    }
}
