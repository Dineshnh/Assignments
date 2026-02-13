import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveNegative {
    
    public void rearrange(int[] arr){
        List<Integer> Positive = new ArrayList<>();
        List<Integer> Negative = new ArrayList<>();

        for(int num: arr){
            if(num>=0){
                Positive.add(num);
            }
            else{
                Negative.add(num);
            }
        }

        int i=0, j=0, k=0;
        while(i<Positive.size() && j<Negative.size()){
            arr[k++]=Positive.get(i++);
            arr[k++]=Negative.get(j++);
        }

        while(i<Positive.size()){
            arr[k++]=Positive.get(i++);
        }

        while(j<Negative.size()){
             arr[k++]=Negative.get(j++);
        }
       for(int num: arr){
        System.out.print(num+" ");
       }
    }
    public static void main(String[] args) {
        AlternatePositiveNegative apn = new AlternatePositiveNegative();
        int[] arr={1, -4, 2, 3, -1, 4};
        apn.rearrange(arr);
    }
}
