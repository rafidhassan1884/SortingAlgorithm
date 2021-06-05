public class ShellSort {
    public static void sort(Comparable a[]){
        int N = a.length;
        int h = 1;
        while(h<N) h = 3*h + 1;
        while(h>=1) {
            for (int i = 0; i < N; i++) {
                for (int j = i; j -h >= 0 && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
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
