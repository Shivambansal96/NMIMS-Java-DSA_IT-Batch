
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
// public class Day4 {
//     public static void main(String[] args) {
//         String s = "AAAAA";
//         Pattern pat = Pattern.compile("[A-Z]{5}");
//         Matcher mat = pat.matcher(s);
//         boolean res = mat.matches();
//         System.out.println(res);
//     }
// }
// public class Day4 {
//     public static void printNum(int n) {
//         if (n == 0){
//             System.out.println("--------------------------");
//             return;
//         }
//         System.out.println(n);
//         printNum(n - 1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         printNum(n);
//     }
// }
// public class Day4 {
//     public static void printNum(int n, int currSum) {
//         if (n == 0){
//             System.out.println("Sum = " + currSum);
//             return;
//         }
//         printNum(n-1, currSum+n);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int currSum = 0;
//         printNum(n, currSum);
//     }
// }
// public class Day4 {
//     public static int printNum(int n) {
//         if (n == 0){
//             return 0;
//         }
//         return n + printNum(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int res = printNum(n);
//         System.out.println(res);
//     }
// }
// public class Day4 {
//     public static int fact(int n) {
//         if (n == 1 || n == 0){
//             return 1;
//         }
//         return n * fact(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int r = 3;
//         int num = fact(n);
//         int denom = fact(n-r);
//         int perm = num / denom;
//         System.out.println("Permutation = " + perm);
//     }
// }
// public class Day4 {
//     public static int fact(int n) {
//         if (n == 1 || n == 0){
//             return 1;
//         }
//         return n * fact(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int r = 3;
//         int num = fact(n);
//         int denom = fact(n-r) * fact(r);
//         int comb = num / denom;
//         System.out.println("Combination = " + comb);
//     }
// }
// // ! Understanding the problems faced with/without recursion (WHY TO USE RECURSION)
// public class Day4 {
//     public static void fact(int n) {
//         if (n == 1 || n == 0){
//             return;
//         }
//         System.out.println(n);
//         fact(n+1);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         fact(n);
//         // while (n < 4) {
//         //     System.out.println(n);
//         //     n--;
//         // }
//     }
// }
import java.util.ArrayList;
import java.util.Arrays;

public class Day4 {

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arrList) {
        if (arrList.size() <= 1) {
            return arrList;
        }
        
        int pivot = arrList.get(0);
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();

        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) > pivot) {
                big.add(arrList.get(i));
            } else {
                small.add(arrList.get(i));
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        res.addAll(quickSort(big));
        res.add(pivot);
        res.addAll(quickSort(small));

        return res;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(45, 13, 44, 99, 98, 1, 47));

        System.out.println(quickSort(arrList));
    }
}


