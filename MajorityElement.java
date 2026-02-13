import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,5,6,7,8,1,1,1,1};
        Arrays.sort(arr);

        int count=1;
        int maxcount=arr.length/2;
        int maxelement=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;
            }

            if(count>maxcount){
                maxelement=arr[i];
                break;
            }
        }
        System.out.println("Max occured ele is "+maxelement+" and it occured "+count+" times");
    }
}
