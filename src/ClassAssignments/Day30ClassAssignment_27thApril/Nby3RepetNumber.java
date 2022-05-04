package ClassAssignments.Day30ClassAssignment_27thApril;

public class Nby3RepetNumber {
    public static void main(String[] args) {
        int arr[]={ 1, 1, 1, 2, 3, 5, 7};
        int result=findMajorityelement(arr);
        System.out.println(result);
    }

    private static int findMajorityelement(int arr[]) {

        int elem = arr[0];
        int elem1=arr[0];
        int freq = 1;
        int freq1=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == elem) {
                freq++;
            }else if(arr[i]==elem1){
                freq1++;
            }
            else if(freq ==0){
                freq++;
                elem=arr[i];
            }
            else if(freq1==0){
                freq1++;
                elem1=arr[i];
            }
            else{
                freq--;
                freq1--;
            }
        }

        int count = 0;
        int count1=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                count++;
            }
            else if(arr[i]==elem1){
                count1++;
            }
        }
        if (count > arr.length / 3) {
            return elem;
        }
        if (count1 > arr.length / 3) {
            return elem1;
        }
            return -1;

    }
}
