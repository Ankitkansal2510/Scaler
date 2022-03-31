package ClassAssignments.Day20ClassAssignment_28thMarch;

import java.util.Arrays;

public class SeperateODd_Even {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int oddArray[] =new int[arr.length];
        int evenArray[]=new int[arr.length];

        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenArray[even]=arr[i];
                even++;
            }else{
                oddArray[odd]=arr[i];
                odd++;
            }
        }

        if(evenArray.length>0){
            for(int i=0;i<even;i++){
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        }
        if(oddArray.length>0){
            for(int i=0;i<odd;i++){
                System.out.print(oddArray[i] + " ");
            }
        }
    }
}
