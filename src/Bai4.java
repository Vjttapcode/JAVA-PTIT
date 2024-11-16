import java.util.*;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            long tich = 1;
            long tong = 0;
            String s = sc.nextLine();
            for(int i=0; i<s.length(); i++){
                if(i%2==0){
                    if(s.charAt(i)>'0'){
                        tich *= s.charAt(i)-'0';
                    }
                }
                else{
                    tong += s.charAt(i) - '0';
                }
            }
            System.out.println(tich + " " + tong);
        }
    }
}
