package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayProblem1 {

    public void reverseAarry(int a[]){
        int l = a.length;
        int b [] = new int[l];
        for(int i=0; i<a.length; i++){
            b[l-1] = a[i];
            l --;
        }

        for (int k=0; k<b.length; k++){
            System.out.print(b[k]);
        }
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here

        int sum = 0;

        for (int i=0; i<ar.size(); i++){
            sum = sum + ar.get(i);
        }

        //System.out.println(sum);

        return sum;

    }


    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int size = a.size()-1;
        List<Integer> newArray = new ArrayList<>();
       for(int i= size; i>=0 ; i--){
           int j = a.get(size);
           newArray.add(j);
           size--;

       }
     //  newArray.forEach(System.out::println);
        System.out.println(newArray);

       return newArray;

    }


    public static void main(String[] args) {

        ArrayProblem1 arrayProblem1 = new ArrayProblem1();

       // int [] arr = {1,2,3,4,0};

       // arrayProblem1.reverseAarry(arr);


        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);

        ArrayProblem1.reverseArray(a);
        ArrayProblem1.simpleArraySum(ar);
    }
}
