import java.util.*;
public class DominateNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,4,5,1,1,1};
        //Dominate d1 = new Dominate();
        InnerDominateNumber d1 = new InnerDominateNumber();
        System.out.println(d1.Dnumber(arr));
    }
}

class InnerDominateNumber {
    ArrayList<Integer> Dnumber(int[] arr){
        Arrays.sort(arr);
        int singleton = 0;
        int i = 0;
        while (i < arr.length) {
            int count = 1;
            while(i+count<arr.length && arr[i+count]==arr[i]){
                count++;
            }
            if(count == 1){
                singleton++;
            }
            i += count;
        }
        i = 0;
        ArrayList<Integer> arrlist = new ArrayList<>(); 
        while (i < arr.length) {
            int count = 0;
            while(i+count<arr.length && arr[i+count]==arr[i]){
                count++;
            }
            if(count>singleton){
                arrlist.add(arr[i]);
            }
            i += count;
        }
        return arrlist;
    }   
}

// class Dominate{
//     ArrayList Dnumber(int[] arr){
//         Arrays.sort(arr);
//         ArrayList<Integer> arrlList = new ArrayList<>();
//         HashMap<Integer,Integer> freq = new HashMap<>();
//         for (int i = 0;i < arr.length; i++){
//             int num = arr[i];
//             if(freq.containsKey(num)){
//                 freq.put(num, freq.get(num)+1);
//             }
//             else{
//                 freq.put(num, 1);
//             }
//         }

//         int singleton = 0;
//         for(int con : freq.values()){
//             if(con==1)
//                 singleton++;
//         }

//         for(Integer key : freq.keySet()){
//             int con = freq.get(key);
//             if(con > singleton)
//                 arrlList.add(key);
//         }

//         return arrlList;
//     }
// }
