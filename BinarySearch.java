public class BinarySearch{

    public void search(int element, int[] arr){
        int low= 0;
        int high= arr.length-1;
        boolean found = false;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==element){
                System.out.println("Element found at index: "+mid);
                found=true;
                break;
            }
            else if(arr[mid]>element){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(!found){
            System.err.println("Element not found");
        }
    }


    public static void main(String[] args) {
        BinarySearch b1 = new BinarySearch();
        b1.search(10,new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}