import java.lang.annotation.Repeatable;

public class lesson1_hw4 {
    public static void main(String[] args) {

        int year = 2020;
        System.out.println(vesok(year));
    }
    static boolean vesok(int year) {
        if (year % 4 == 0){
            return true;
        }
        else {
            return false;
        }
    }
        
}