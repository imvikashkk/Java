/**************************************Print Number N_to_1  ******************************/
// import java.util.*;
// public class _01_Print_Number {
//     public static void print_N_to_1(int N){
//         // Base Case
//         if(N==0){
//             return;
//         }
//         // Operation Printing
//         System.out.print(N+" ");
//         // Recursive Relation
//         print_N_to_1(N-1);
//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the N no. : ");
//         int N = sc.nextInt();
//         print_N_to_1(N);
//     }
// }


/***********************************Print Number 1_to_N **********************************/
// import java.util.*;
// public class _01_Print_Number {
//     public static void print_N_to_1(int num, int N){
//         // Base Case
//         if(N<num){  // N == num+1
//             return;
//         }
//         // Operation Printing
//         System.out.print(num+" ");
//         // Recursive Relation
//         print_N_to_1(num+1, N);
//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the N no. : ");
//         int N = sc.nextInt();
//         print_N_to_1(1,N);
//     }
// }

/************************Print Sum of N natural Number **************************/
// import java.util.*;
// public class _01_Print_Number {
//     public static void print_N_Natural_Number(int sum, int N){
//         // Base Case
//         if(N==0){ 
//          System.out.println("Sum Of "+N+" Natural Number Is : "+sum); 
//             return;
//         }
//         // Operation Summing
//         sum = sum + N;
        
//         // Recursive Relation
//         print_N_Natural_Number(sum, N-1);

//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the N no. : ");
//         int N = sc.nextInt();
//         print_N_Natural_Number(0,N);
        
//     }
// }


/****************************Factorial **********************/
// import java.util.*;
// public class _01_Print_Number {
//     public static int factorial(int N){

//         // Base Case
//         if(N==1 || N==0){ 
//             return 1;
//         }

//         // Operation Summing
//         int fact = N * factorial(N-1);

//         return fact;

//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the N no. : ");
//         int N = sc.nextInt();
//         int ans = factorial(N);
//         System.out.println(ans);
//     }
// }



/************************* Fibonacci_Series *********************/
// import java.util.*;
// public class _01_Print_Number {
//     public static void fibonacci(int ft, int st, int N){

//         // Base Case
//         if(N==0){ 
//             return;
//         }

//         // Operation
//         int fb = ft + st;
//         System.out.print(" "+fb);

//         // Recursive Relation
//         fibonacci(st,fb, N-1);

//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the N no. : ");
//         int N = sc.nextInt();
//         if(N==1){
//             System.out.println("0");
//         }else if(N==2){
//             System.out.println("0 1");
//         }else if(N>2){
//            System.out.print("0 1");
//            fibonacci(0,1, N-2);
//         }else{
//             System.out.println("Invalid Value");
//         }
//     }
// }


/******************Print x^n Power // TimeCoplexity : O(n) **********************/

// import java.util.*;
// public class _01_Print_Number {
//     public static int power(int x, int n){
//         // Base Case
//         if(n==1 || n==0){
//             return 1;
//         }
//         // Base Case 2
//           if(x==0){
//              return 0;
//           }
//         // Operation
//         x = x*x;
//         // Recursive Relation
//         power(x,n-1);
//         // Return Type
//         return x;
//     }


//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the X base : ");
//         int x = sc.nextInt();
//         System.out.print("Enter the n power : ");
//         int n = sc.nextInt();
//         int ans = power(x, n);
//         System.out.println(x+"^"+n+" is : "+ans);
//     }
// }


/******************Print x^n Power // TimeCoplexity : O(logn) **********************/

import java.util.*;
public class _01_Print_Number {
    public static int power(int x, int n){
        // Base Case
        if(n==0){
            return 1;
        }
        // Base Case 2
        if(x==0){
            return 0;
        }
        
        if(n%2==0){
            return power(x,n/2)*power(x,n/2);
        }
        else{ // n%2 == 1
            return power(x,n/2)*power(x,n/2)*x;
        }
    }


    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X base : ");
        int x = sc.nextInt();
        System.out.print("Enter the n power : ");
        int n = sc.nextInt();
        int ans = power(x, n);
        System.out.println(x+"^"+n+" is : "+ans);
        sc.close();
    }
}


