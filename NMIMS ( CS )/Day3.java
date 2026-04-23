
// // ! Comparators 
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         List<Integer> arrList = new ArrayList<>(Arrays.asList(43, 11, 56, 99, 20));
//         Comparator<Integer> cmp = new Comparator<Integer>() {
//             @Override
//             public int compare(Integer a, Integer b) {
//                 if(a%10 > b%10)
//                     return 1;
//                 else
//                     return -1;
//             }
//         };
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
//     }
// }
// // ! Comparators 
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// public class Day3 {
//     public static void main(String[] args) {
//         List<Integer> arrList = new ArrayList<>(Arrays.asList(43, 11, 56, 99, 20));
//         Comparator<Integer> cmp = new Comparator<Integer>() {
//             @Override
//             public int compare(Integer a, Integer b) {
//                 if (a % 2 == 1) {
//                     return 1; 
//                 }else {
//                     return -1;
//                 }
//             }
//         };
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
//     }
// }
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// class Student {
//     String name;
//     int age;
//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", age=" + age + "]";
//     }
// }
// public class Day3 {
//     public static void main(String[] args) {
//         List<Student> arrList = new ArrayList<>();
//         Comparator<Student> cmp = (Student a, Student b) -> {
//             if (a.age > b.age) {
//                 return 1;
//             } else {
//                 return -1;
//             }
//         };
//         arrList.add(new Student("Shivam", 26));
//         arrList.add(new Student("Sejal", 24));
//         arrList.add(new Student("Tithee", 22));
//         arrList.add(new Student("Shiva", 9999));
//         arrList.add(new Student("Mohini", 29));
//         Collections.sort(arrList, cmp);
//         for (Student val : arrList) {
//             System.out.println(val);
//         }
//     }
// }
// public class Day3 {
//     public static void main(String[] args) {
//         int[] arr = {1, 12, -5, -6, 50, 3};
//         int k = 4;
//         int currentSum = 0;
//         for (int i = 0; i < k; i++) {
//             currentSum += arr[i];
//         }
//         int maxSum = currentSum;
//         for (int i = k; i < arr.length; i++) {
//             currentSum += arr[i];
//             currentSum -= arr[i - k];
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         System.out.println((float) maxSum / k);
//     }
// }



import java.util.HashSet;

public class Day3 {

    public static void main(String[] args) {
        String s = "abcdabcbb";
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            int window = right - left + 1;
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, window);
        }

        System.out.println(maxLength);

    }
}
