public class CustomMethods {
    private int[] arr;

    public CustomMethods(int[] initilArr){
        this.arr=initilArr;
    }

    public void Push(int element){
        int[] newArr = new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        newArr[arr.length]=element;
        this.arr= newArr;
    }

    public void Pop(){
        if(arr.length==0) return;
        int[] newArr = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            newArr[i]=arr[i];
        }
        this.arr= newArr;
    }

    public void AddbyIndex(int index, int element){
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(i==index){
                newArr[i]=element;
            }
            else{
                newArr[i]=arr[i];
            }
        }
        this.arr= newArr;
    }

    public void DeletebyIndex(int index){
        int[] newArr = new int[arr.length-1];
        for(int i=0, j=0; i<arr.length; i++){
            if(i==index){
                continue;
            }
            else{
                newArr[j++]=arr[i];
            }
        }
        this.arr= newArr;
    }

    public void display(){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomMethods t1 = new CustomMethods(new int[]{1,2,3,4,5,6,7,8,9});
        t1.display();
        t1.Push(100);
        t1.Push(101);
        t1.Push(102);
        t1.display();
        t1.Pop();
        t1.display();
        t1.AddbyIndex(0,1001);
        t1.display();
        t1.DeletebyIndex(0);
        t1.display();
    }
}