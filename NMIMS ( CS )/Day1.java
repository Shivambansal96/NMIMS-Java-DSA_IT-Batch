
// class Day1 {
//     public static void main(String[] args) {
//         int[] arr = {0, 4, 0, 9};
//         int j = 0;
//         for(int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }
//         for(int val: arr)
//             System.out.print(val);
//     }
// }
// // ! ArrayList in-built methods
// import java.util.ArrayList;
// class Day1 {
//     public static void main(String[] args) {
//         ArrayList<Integer> arrList = new ArrayList<>();
//         // int[] arr = {42, 1, 52, 7, 89, 10};
//         // int[] arr = new int[5];
//         arrList.add(2);
//         arrList.add(1);
//         arrList.add(3);
//         System.out.println(arrList);
//         arrList.add(4);
//         System.out.println(arrList);
//         System.out.println(arrList.get(2));
//         arrList.add(3, 100);
//         System.out.println(arrList);
//         arrList.set(0, 5);
//         System.out.println(arrList);
//         arrList.remove(2);
//         System.out.println(arrList);
//         System.out.println(arrList.size());
//     }
// }
// // ! Remove Duplicates
// class Day1 {
//     public static void main(String[] args) {
//         ArrayList<Integer> arrList = new ArrayList<>();
//         int[] arr = {1, 4, 1, 1, 4, 2, 6, 7, 9, 1};
//         for (int val : arr) {
//             arrList.add(val);
//         }
//         for (int i = 0; i < arrList.size(); i++) {
//             for (int j = i + 1; j < arrList.size(); j++) {
//                 if (arrList.get(i).equals(arrList.get(j))) {
//                     arrList.remove(j);
//                     j--;
//                 }
//             }
//         }
//         System.out.print(arrList);
//     }
// }
// //  ! HashSet in-built Methods
// import java.util.HashSet;
// class Day1 {
//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();
//         set.add(5);
//         set.add(51);
//         set.add(1);
//         System.out.println(set);
//         System.out.println(set.contains(51));
//         System.out.println(set.contains(4));
//         set.remove(51);
//         System.out.println(set);
//     }
// }


// import java.util.HashSet;

// class Day1 {

//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();

//         int[] arr = {1, 2, 1, 2, 4, 56, 78};

//         for(int val:arr)
//             set.add(val);
        
//         if (arr.length == set.size()) {
//             System.out.println("True");
//         }

//         else {
//             System.out.println("False");
//         }

//     }
// }




import java.util.HashSet;

class Day1 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // int[] arr = {1, 2, 1, 2, 4, 56, 78};
        int[] arr = {1, 2, 4, 56, 78};

        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                flag = true;
                break;
            }

            set.add(arr[i]);
        }
        
        System.out.println(flag);

    }
}
