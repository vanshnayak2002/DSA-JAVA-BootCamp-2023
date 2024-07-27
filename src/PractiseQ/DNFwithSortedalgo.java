package PractiseQ;

public class DNFwithSortedalgo {

   public static void sort(int[] arr){
       int start=0;
       int end= arr.length-1;
       while (start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
   }



    public static void main(String[] args) {
       int arr[]={1,0,0,2,1,2,0,1};
        sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        };
    }

}
