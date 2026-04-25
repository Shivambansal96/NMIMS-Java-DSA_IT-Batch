
import java.util.HashSet;


// public class Day6LL {
//     Node head;
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             // newNode.data = data;
//             next = null;
//         }
//         // Node Class ENDS
//     }
//     // LinkedList Class ENDS
//     public void prepend(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void append(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node currentNode = head;
//         while (currentNode.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;
//     }
//     public void DeleteStart() {
//         if (head == null) {
//             System.out.println("List is Empty !!!");
//             return;
//         }
//         head = head.next;
//     }
//     public void DeleteEnd() {
//         if (head == null) {
//             System.out.println("List is Empty !!!");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             return;
//         }
//         Node currentNode = head;
//         while (currentNode.next.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = null;
//     }
//     public void printList() {
//         Node currentNode = head;
//         while (currentNode != null) {
//             System.out.print(currentNode.data + " -> ");
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         Day6LL list = new Day6LL();
//         list.append(38);
//         list.prepend(40);
//         list.append(4);
//         list.prepend(33);
//         list.printList();
//         list.DeleteStart();
//         list.printList();
//         list.DeleteEnd();
//         list.printList();
//     }
// }
// public class Day6LL {
//     Node head;
//     Node tail;
//     class Node {
//         int data;
//         Node prev;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             // newNode.data = data;
//             next = null;
//             prev = null;
//         }
//         // Node Class ENDS
//     }
//     // LinkedList Class ENDS
//     public void prepend(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//             return;
//         }
//         head.prev = newNode;
//         newNode.next = head;
//         head = newNode;
//     }
//     public void append(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         newNode.prev = tail;
//         tail = newNode;
//     }
//     public void DeleteStart() {
//         if (head == null) {
//             System.out.println("List is Empty !!!");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             tail = null;
//             return;
//         }
//         head = head.next;
//         head.prev = null;
//     }
//     public void DeleteEnd() {
//         if (head == null) {
//             System.out.println("List is Empty !!!");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             tail = null;
//             return;
//         }
//         tail = tail.prev;
//         tail.next = null;
//     }
//     public void printList() {
//         Node currentNode = head;
//         while (currentNode != null) {
//             System.out.print(currentNode.data + " -> ");
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         Day6LL list = new Day6LL();
//         list.append(38);
//         list.prepend(40);
//         list.append(4);
//         list.prepend(1221);
//         list.prepend(33);
//         list.printList();
//         // list.DeleteStart();
//         // list.printList();
//         list.DeleteEnd();
//         list.printList();
//     }
// }


public class Day6LL {

    Node head;
    Node tail;

    class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            // newNode.data = data;
            next = null;
            prev = null;
        }
        // Node Class ENDS
    }
    // LinkedList Class ENDS

    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        head.prev = tail;

    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        newNode.next = head;
        head.prev = tail;
    }

    public void DeleteStart() {
        if (head == null) {
            System.out.println("List is Empty !!!");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = tail;

    }

    public void DeleteEnd() {
        if (head == null) {
            System.out.println("List is Empty !!!");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = head;
    }

    public void printList() {
        Node currentNode = head;
        HashSet<Node> set =new HashSet<>();
        while (!set.contains(currentNode)) {
            set.add(currentNode);
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Day6LL list = new Day6LL();

        list.append(38);
        // list.prepend(40);
        list.append(4);
        // list.prepend(1221);
        // list.prepend(33);

        list.printList();

        // list.DeleteStart(); // CHange required
        // list.printList();
        // list.DeleteEnd(); // CHange required
        // list.printList();
    }
}
