import java.util.*;
import java.lang.*;

public class ToggleCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter String: ");
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(65 <= (int)ch && ch <= 90){
                System.out.print((char)(ch+32));
            }
            else{
                System.out.print((char)(ch-32));
            }
        }
    }
}
