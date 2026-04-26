
// public class Day7Stack {
//     Node head;
//     String name = "Shivam";
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
//     public void push(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is Empty !!!");
//             return -1;
//         }
//         int temp = head.data;
//         head = head.next;
//         return temp;
//     }
//     public int peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is Empty !!!");
//             return -1;
//         }
//         return head.data;
//     }
//     public void printStack() {
//         Node currentNode = head;
//         while(currentNode != null) {
//             System.out.println("| " + currentNode.data +  " |");
//             System.out.println("|----|");
//             currentNode = currentNode.next;
//         }
//     }
//     public static void main(String[] args) {
//         Day7Stack stk = new Day7Stack();
//         stk.push(30);
//         stk.push(20);
//         stk.push(10);
//         stk.push(40);
//         stk.printStack();
//         System.out.println();
//         stk.pop();
//         stk.printStack();
//         // (Optional)
//         // while(!stk.isEmpty()) {
//         //     System.out.println(stk.peek());
//         //     stk.pop();
//         // }
//         // System.out.println(stk.name);
//     }
// }
// public class Day7Stack {
//     ArrayList<Integer> arrList = new ArrayList<>();
//     public boolean isEmpty() {
//         return arrList.size() == 0;
//     }
//     public void push(int data) {
//         arrList.add(data);
//     }
//     public int pop() {
//         int n = arrList.size();
//         if (isEmpty()) {
//             System.out.println("Stack is Empty !!!");
//             return -1;
//         }
//         int temp = arrList.get(n-1);
//         arrList.remove(n-1);
//         return temp;
//     }
//     public int peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is Empty !!!");
//             return -1;
//         }
//         return arrList.get(arrList.size() - 1);
//     }
//     public void printStack() {
//         int n = arrList.size();
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.println("| " + arrList.get(i) + " |");
//             System.out.println("|----|");
//         }
//     }
//     public static void main(String[] args) {
//         Day7Stack stk = new Day7Stack();
//         stk.push(30);
//         stk.push(20);
//         stk.push(10);
//         stk.push(40);
//         // stk.printStack();
//         System.out.println();
//         stk.pop();
//         // stk.printStack();
//         // // (Optional)
//         // while(!stk.isEmpty()) {
//         //     System.out.println(stk.peek());
//         //     stk.pop();
//         // }
//         // System.out.println(stk.name);
//     }
// }
// import java.util.Stack;
// public class Day7Stack {
//     public static void main(String[] args) {
//         Stack<Integer> stk = new Stack<>();
//         stk.push(30);
//         stk.push(20);
//         stk.push(10);
//         stk.push(40);
//         while(!stk.isEmpty()) {
//             System.out.println(stk.peek());
//             stk.pop();
//         }
//         System.out.println();
//         stk.pop();
//         while(!stk.isEmpty()) {
//             System.out.println(stk.peek());
//             stk.pop();
//         }
//     }
// }
import java.util.*;

public class Day7Stack {

    public static boolean isValidP(String s) {
        Stack<Character> stk = new Stack<>();

        // "[(){}]"
        // "]["
        // stk = ""
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if(stk.isEmpty()) {
                    return false;
                }
                if (ch == '}' && stk.peek() == '{' || ch == ')' && stk.peek() == '(' || ch == ']' && stk.peek() == '[') {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "[({})";
        if (isValidP(s1) == true) {
            System.out.println(s1+ " " + "is Valid");
        }
        else {
            System.out.println(s1+ " " + "is InValid");
        }
    }

}
