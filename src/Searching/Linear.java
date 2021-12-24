package Searching;
import java.util.*;
public class Linear {
    static int Linear_Search(int arr[], int n, int key){
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Element : "+n);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Searching Of Element : ");
        int key = sc.nextInt();
        System.out.println(Linear_Search(arr,n,key));
    }
}
// Compiler And Execution