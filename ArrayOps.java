public class ArrayOps {
    public static void main(String[] args) {
   
}
    
    public static int findMissingInt (int[] array) {
        int len = array.length;
        int i = 0;
        int j = 0;

        while (i<len) {
            while (j<len) {
               if(array[j] == i){
                j++;
                i++;
               }
                else if(array[j] != i){
                    j++;
                }
            }
           
            i++;
        }
        return i;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
