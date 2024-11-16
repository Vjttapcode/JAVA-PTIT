import java.util.*;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            ArrayList<Character> a = new ArrayList<>();
            int sum = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    sum += s.charAt(i) - '0';
                }
                else{
                    a.add(s.charAt(i));
                }
            }
            Collections.sort(a);
            for(Character x : a){
                System.out.print(x);
            }
            System.out.println(sum);
        }
    }
}
