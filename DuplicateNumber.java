public class DuplicateNumber {
    public static void findDuplicate(int[] arr){
        // xor all element with [1,n]
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            ans = ans^arr[i];
        }
        for(int i=1; i<arr.length; i++){
            ans = ans^i;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // Given an array of size n containing element [1,n-1] and one number is duplicate
        int[] arr = {2,3,2,5,4,1};
        findDuplicate(arr);
    }
}