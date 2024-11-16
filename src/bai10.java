import java.util.*;

public class bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String bi = sc.nextLine();
        int countX = 0, countT = 0, countD = 0;
        for(char c : bi.toCharArray()){
            if(c=='X') countX++;
            else if(c=='T') countT++;
            else if(c=='D') countD++;
        }
        int swapXT = 0, swapXD = 0, swapTD = 0;
        int whiteinred = 0, blueinwhite = 0, redinwhite = 0;

        for(int i=0; i<countX; i++){
            if(bi.charAt(i) == 'T') swapXT++;
            else if(bi.charAt(i) == 'D') swapXD++;
        }
        for(int i = countX; i<countX + countT; i++){
            if(bi.charAt(i) == 'X') blueinwhite++;
            else if(bi.charAt(i) == 'D') redinwhite++;
        }
        for(int i = countX + countT; i<n; i++){
            if(bi.charAt(i) == 'T') whiteinred++;
            else if(bi.charAt(i) == 'X') blueinwhite++;
        }
        int minswaps = swapXT + swapXD + swapTD;
        int mincrossswaps = Math.min(swapXT, redinwhite) + Math.min(swapXD, whiteinred);
        minswaps += mincrossswaps;
        System.out.println(minswaps);
        sc.close();
    }
}
