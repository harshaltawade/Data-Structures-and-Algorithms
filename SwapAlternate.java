public class SwapAlternate {
    public static void swapAlternate(int[] a){
        int i=0,j=1;
        while(i<a.length && j<a.length){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i+=2;
            j+=2;
        }
    }

    public static void swapAlternateUsingForLoop(int[] a){
        for(int i=0; i<a.length; i+=2){
            if(i+1<a.length){
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println("Before Swapping: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("After Swapping: ");
        // swapAlternate(a);
        swapAlternateUsingForLoop(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}