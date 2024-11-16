import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long res = -1L;
            int sqr = (int)Math.sqrt(n);
            for(int i=2; i<=sqr; i++){
                if(n%i==0){
                    res = Math.max(res,i);
                    while(n%i==0){
                        n/=i;
                    }
                }
            }
            if(n>1) res = n;
            System.out.println(res);
        }
    }
}
