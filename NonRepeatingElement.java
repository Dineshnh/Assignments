import java.util.*;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {0,7,2,3,0,5,4,1,2,8,7,8};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
        for(int num:arr){
            if(map.get(num)==1){
                System.out.println(num);
                return;
            }
        }
    }
}
