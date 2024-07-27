package PatternsQ;

public class firstOccurence {

    static int FirstOccurence(int []arr,int start,int end ,int ele){
        int result=-1;
        while (start<=end){

            int mid=start+end-start/2;
                if(ele<=arr[mid]){
                   result=mid;
                   end=mid-1;
                }

                else{
                    start=mid+1;
                }
            }
        return result;
        }

    static int LastOccurence(int []arr,int start,int end ,int ele){
        int result=-1;
        while (start<=end){

            int mid=start+end-start/2;
            if(ele>=arr[mid]){
                result=mid;
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }
        return result;
    }


        public static void main(String[] args) {
            int arr[]={2,4,10,10,10,18,20};
            System.out.println(FirstOccurence(arr,0,6,10));
            System.out.println(LastOccurence(arr,0,6,10));
        }
    }

    
