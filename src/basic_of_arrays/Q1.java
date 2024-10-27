package basic_of_arrays;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int [] i = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int a = 0; a<i.length ; a++){
            System.out.println("Enter Student "+ (a+1) + " marks = ");
            i[a] = scan.nextInt();
        }
        for(int x :i){
            System.out.println(x +" ");
        }
        System.out.println("Hello world!");
    }
}