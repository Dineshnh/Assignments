public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            arr[left]+=arr[right];
            arr[right]=arr[left]-arr[right];
            arr[left]-=arr[right];

            left++;
            right--;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
