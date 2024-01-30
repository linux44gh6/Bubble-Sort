
import java.util.Scanner;
public class Main {
    public static void bubbleSort(int a[]){
        int n=a.length;
        int temp;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
       for (int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       bubbleSort(a);
    }
}