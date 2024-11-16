import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                map.put(x,map.getOrDefault(x,0)+1);
            }
            List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
            for(Map.Entry<Integer,Integer> entry:list){
                for(int i=0; i<entry.getValue(); i++){
                    System.out.print(entry.getKey()+" ");
                }
            }
            System.out.println();
        }
    }
}
