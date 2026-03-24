public class UniqueNumberOfOccurrences {
    public static Boolean hasUniqueElementOccurence(int[] arr){
        // Constraints
        //     1 <= arr.length <= 1000
        //      -1000 <= arr[i] <= 1000
        int LENGTH = 2001;
        int PREFIX = 1000;
        int[] freq = new int[LENGTH];
        boolean[] freq_check = new boolean[LENGTH];

        for(int i=0; i<arr.length; i++){
            freq[PREFIX+arr[i]]++;
        }

        for(int i=0; i<freq.length; i++){
            int count = freq[i];
            if(count!=0){
                if(freq_check[count]){
                    return false;
                }
                freq_check[count] = true;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3,3,3,3};
        System.out.println(hasUniqueElementOccurence(arr));
    }
}