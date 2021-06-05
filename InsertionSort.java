public class InsertionSort {
    public static void sort(Comparable a[]){
        for(int i = 0; i<a.length;i++){
            for(int j=i; j>0;j--){
                if(less(a[j-1],a[j]))
                    break;
                exch(a , j ,j-1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w){
        if(v.compareTo(w) < 0) return true;
        return false;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable samp = a[i];
        a[i] = a[j];
        a[j] = samp;
    }
}
