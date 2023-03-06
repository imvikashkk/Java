// Set union A | B
// Set intersection A & B
// Set subtraction A & ~B
// Set negation ALL_BITS ^ A or ~A
// Set bit A |= 1 << bit
// Clear bit A &= ~(1 << bit)
// Test bit (A & 1 << bit) != 0
// Extract last bit A&-A or A&~(A-1) or x^(x&(x-1))
// Remove last bit A&(A-1)
// Get all 1-bits ~0


public class Main{
    public static void main(String args[]){
        Main vk = new Main();
        System.out.println(vk.SetUnion(5,3));
        System.out.println(vk.SetInterSection(5,10));
        System.out.println();
    }

    int SetUnion(int num, int pos){
        return (num | pos)
    }

    int SetInterSection(int num1, int num2){
        return num1 & num2;
    }

    int SetSubstraction(int num1, int num2){
        return (num1 & ~num2);
    }

   
}