/*
Question : Write a program to add the odd and even number in given array.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,sum2 = 0;
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] Array = new int[size];
        System.out.println("Enter the element of array :");
        for (int i = 0; i < size; i++){
            Array[i] = sc.nextInt();
        }
        System.out.println("Firstly, printing the array :");
        for (int i = 0; i < size; i++){
            System.out.println(Array[i]);
        }
        System.out.println("Printing the result :");
        for (int i = 0; i < size; i++){
            if (Array[i] % 2 == 0){
                sum += Array[i];
            }else
                sum2 += Array[i];
        }
        System.out.println("Printing the even number : " + sum);
        System.out.println("Printing the odd number : " + sum2);
    }
}