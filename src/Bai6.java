import java.util.*;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] a = s.split("\\s+");
            for(int i=0; i<a.length; i++){
                a[i] = String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            }
            if(n==1){
                System.out.print(a[a.length-1] + " ");
                for(int i=0; i<a.length-1; i++){
                    System.out.print(a[i]+" ");
                }
            }
            else{
                for(int i=1; i<a.length; i++){
                    System.out.print(a[i]+" ");
                }
                System.out.print(a[0]);
            }
            System.out.println();
        }
    }
}
