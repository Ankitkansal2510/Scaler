package ClassAssignments.Day20ClassAssignment_28thMarch;
//Search if given element exist in an array or not

public class SearchElement {

    public static void main(String[] args) {
        int arr[]={4,1,5,9,1};
        int element=25;
    int i;
        for( i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("1");
                break;
            }
        }
        if(i==arr.length){
            System.out.println("0");
        }
    }
}
