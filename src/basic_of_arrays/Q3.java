package basic_of_arrays;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] arrayTest = {1,4,2,3,6,4,8,9,4,5};
        for(int x: arrayTest){
            System.out.print(x +" ");
        }
        System.out.println();
        Q3 test = new Q3();
        int[] newArray = test.removeDuplicate(arrayTest);
        for(int x: newArray){
            System.out.print(x +" ");
        }
    }
    int[] removeDuplicate(int[] oldArray){
        int[] newArray = new int[oldArray.length];
        int x = 0;
        Arrays.sort(oldArray);
        for(int i = 0; i < oldArray.length-1; i++){
                if(oldArray[i] != oldArray[i+1]){
                    newArray[x] = oldArray[i];
                    x++;
                }
        }
        newArray[x++] = oldArray[oldArray.length-1];
        newArray = Arrays.copyOf(newArray,x);
        return newArray;
    }
}
