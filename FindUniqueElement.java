public class FindUniqueElement {
    public static void findUnique(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans^=arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,2,4,8,5,5};
        findUnique(arr);
    }
}