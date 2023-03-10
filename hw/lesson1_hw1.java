public class lesson1_hw1 {
 
    public static void main(String[] args) {
        
        System.out.println(sumOfTwoNumbers(5, 15));
        System.out.println(sumOfTwoNumbers(-3, -6));
        System.out.println(sumOfTwoNumbers(7, 13));
        
    }
    
    static boolean sumOfTwoNumbers(int a, int b){
        if(a + b <= 20 && a+b >= 10) {
            return true;
        }
        else {
            return false;
        }
    }
    
}