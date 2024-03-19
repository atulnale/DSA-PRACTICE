package problem84;

public class Approach1 {
    public static int[] getSecondOrderElements(int n, int []a) {
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for(int ele : a){
            if(ele >= largest){
                largest2 = largest;
                largest = ele;
            } else if(ele > largest2){
                largest2 = ele;
            }

            if(ele <= smallest){
                smallest2 = smallest;
                smallest = ele;
            } else if( ele < smallest2) {
                smallest2 = ele;
            }
        }
        return new int[]{largest2, smallest2};
    }
}