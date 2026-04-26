// public class Day7Queue {

//     Node head;
//     Node tail;
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public boolean isEmpty() {
//         return head == null;
//     }
//     public void append(int data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }
//     public int pop() {
//         if(head == null) {
//             System.out.println("Queue is Empty");
//             return -1;
//         }
//         int temp = head.data;
//         head = head.next;
//         return temp;
//     }
//     public int peek() {
//         if(isEmpty()) {
//             return -1;
//         }
//         return head.data;
//     }
//     public void printList() {
//         Node currentNode = head;
//         while (currentNode != null) {
//             System.out.println("| " + currentNode.data + " |");
//             System.out.println("|----|");
//             currentNode = currentNode.next;
//         }
//     }
//     public static void main(String[] args) {
//         Day7Queue q = new Day7Queue();
//         q.append(10);
//         q.append(20);
//         q.append(30);
//         q.append(40);
//         q.printList();
//         System.out.println();
//         q.pop();
//         q.printList();
//         System.out.println();
//         System.out.println(q.peek());
//     }
// }
public class Day7Queue {

    int[] arr;
    int size;
    int rear;

    public Day7Queue(int n) {
        arr = new int[n];
        this.size = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        // return size == rear+1;
        return size == arr.length;
    }

    public void append(int data) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        }

        size++;
        if (isEmpty()) {
            arr[0] = data;
            rear = 0;
            return;
        }

        arr[++rear] = data;

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!!");
            return -1;
        }

        size--;
        int temp = arr[0];

        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Full!");
            return -1;
        }

        return arr[0];
    }

    public static void main(String[] args) {
        Day7Queue q = new Day7Queue(5);

        q.append(10);
        q.append(20);
        q.append(60);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); 
            q.pop();
        }

    }
}
