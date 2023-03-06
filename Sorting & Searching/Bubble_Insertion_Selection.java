import java.util.*;

public class Bubble_Insertion_Selection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // // Bubble Sort
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - 1 - i; j++) {
        //         if (arr[j + 1] < arr[j]) {
        //             int temp = arr[j + 1];
        //             arr[j + 1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        


        // // Selection Sort
        // int smallest;
        // for(int i=0; i<n; i++){
        //     smallest = i;
        //     for(int j=i; j<n; j++){
        //         if(arr[j]<arr[smallest]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        // Insertion Sort
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        // Print
         System.out.print("Your Sorted Array Is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

/*
 *******************************BUBBLE***********SELECTION**********INSERTION****
 * Best Time Coplexity : ********Ω(N)**************
 * Average Time Complexity : ***θ(N^2)*************
 * Worst Time Complexity : *****O(N^2)*************
 * Worst Space Complexity : *****O(1)**************
 */