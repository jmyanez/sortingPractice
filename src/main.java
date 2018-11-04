public class main {
    public static void main(String[] args) {
    int[] array = {3,2,1};
    int arraySize = array.length;
    mergeSort(array,arraySize);
    }

    public static void mergeSort(int[] a,int n){
        if(n<2){
            return;
        }
        int m = n/2;
        int[] left = new int[m];
        int[] right = new int[n-m];
        // Fill the new arrays
        for(int i=0;i<m;i++){
            left[i]=a[i];
            //System.out.println(left[i]);
        }
        for(int i=0;i<n-m;i++){
            right[i]=a[i+m];
           // System.out.println(right[i]);
        }

        mergeSort(left,m);
        mergeSort(right,n-m);
        int[] merged = merge(a,left,right,m,n-m);
        for(int i = 0 ;i<merged.length;i++){
            System.out.println(merged[i]);
        }
    }

    public static int[] merge(int[] a, int[] l,int[] r,int left,int right){
        int i=0,j=0,k=0;
        while(i<left && j < right) {
            if (l[i] < r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
            while(i<left){
                a[k++] = l[i++];
            }
            while (j<right){
                a[k++]= r[j++];
            }

        return a;
    }
}
