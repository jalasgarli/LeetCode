
// import java.util.ArrayList;
// import java.util.List;

// class Solution1061 {
//     public String smallestEquivalentString(String s1, String s2, String baseStr) {
//         List<ArrayList<Character>> mainList = new ArrayList<>();
//         for(int i=0; i<s1.length(); i++) {
//             for(int j=0; j<mainList.size(); j++) {
//                 if(mainList.get(i).contains(s1.charAt(i)) || mainList.get(i).contains(s2.charAt(i))) {
//                     if(!mainList.get(i).contains(s1.charAt(i))) {
//                         mainList.get(i).add(s1.charAt(i));
//                     }
//                     if(!mainList.get(i).contains(s2.charAt(i))) {
//                         mainList.get(i).add(s2.charAt(i));
//                     }
//                 } else {
//                     ArrayList<Character> newList = new ArrayList<>();
//                     newList.add(s1.charAt(i));
//                     newList.add(s2.charAt(i));
//                 }
//             }
//         }
//         Sy
//         return "";
//     }
// }


// public class Problem1061 {
//     public static void main(String[] args) {
//         Solution1061 solution1061 = new Solution1061();
//         System.out.println(solution1061.smallestEquivalentString("parker", "morris", "parser"));
//     }
// }
