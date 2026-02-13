public class MergeTwoSortedArray {

    public void merging(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];

        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }
            else{
                res[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
            res[k++]=arr1[i++];
        }

        while(j<arr2.length){
            res[k++]=arr2[j++];
        }

        for(int num: res){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedArray m1 = new MergeTwoSortedArray();
        int[] arr1={1,2,3,4,5,6,7};
        int[] arr2={1,2,3,8,9};
        m1.merging(arr1, arr2);
    }
}
