package day32Methods;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class addElement {

    public static void main(String[] args) {
        int [] arr = {1,2, 3};
        int num = 4;
        int [] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;

        int i =0;
        for (int each:arr){
        arr2 [i]= each;
            i++;
    }
        System.out.println(Arrays.toString(arr2));
}
  public static int [] addElement(int [] arr, int num ){
        int [] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;

        int i =0;
        for (int each:arr){
            arr2 [i]= each;
            i++;
  }
        return arr2;
}}
