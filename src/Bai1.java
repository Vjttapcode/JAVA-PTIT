import java.util.*;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String res = "";
        int max = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(s.length() > max){
                max = s.length();
                res = s;
            }
        }
        System.out.println(res + " - " + max);
    }
}
