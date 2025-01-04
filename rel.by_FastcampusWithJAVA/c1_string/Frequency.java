package p1String;
import java.util.*;

public class Frequency {

    public static int[] frequencySort(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.print("Enter a word: ");
        String str = scan.next();
        String lowerStr = str.toLowerCase();

        int[] compare = frequencySort(lowerStr);
        int maxIndex = 0;
        boolean duplicate = false;

        for (int i = 0; i < 26; i++) {
            if(compare[maxIndex] < compare[i]) {
                maxIndex = i;
                duplicate = false;
            }
            else if(compare[maxIndex] == compare[i] && maxIndex != i) {
                duplicate = true;
            }
        }
        if(duplicate)
            System.out.println("?");
        else
            System.out.println((char)(maxIndex + 'A'));
    }
}
