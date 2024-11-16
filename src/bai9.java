import java.util.*;

public class bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                boolean check = true;
                for(int k=i+1; k<j; k++){
                    if(a[k] > a[i] || a[k] > a[j]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
