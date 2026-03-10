import java.util.Arrays;

public class Array{
    public static void findMax(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        System.out.println(maxi);
    }

    public static void printArray(int[] arr){
        System.out.println("Print inside function: ");
        arr[2] = 120;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(a[2]);
        int[] b = new int[10];
        System.out.println(b[2]);
        System.out.println(b[4]);
        int[] c = new int[10];
        Arrays.fill(c, 5);
        System.out.println(c[4]);
        int[] d = {1};
        int[] arr = {1,2,3,4,5,6,7,8,9,20,32,12,22,24,11};
        printArray(arr);
        System.out.println();
        System.out.println("Print inside function: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        findMax(arr);
    }
}