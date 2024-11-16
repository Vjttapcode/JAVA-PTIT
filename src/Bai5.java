import java.util.*;

public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] words = s.split(" ");
            StringBuilder reversedString = new StringBuilder();
            for(int i=words.length-1;i>=0;i--){
                reversedString.append(words[i]).append(" ");
            }
            System.out.println(reversedString.toString().trim());
        }
    }
}
