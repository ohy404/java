public class exam40 {
    
    static void _inc(int[] m){
        m[0] = m[0]+1;
        System.out.println("in _inc : "+ m[0]);
    }
    public static void main(String[] args) {
        int a[] = {1};
        _inc(a);
        System.out.println("in main : "+ a[0]);


    }
}
