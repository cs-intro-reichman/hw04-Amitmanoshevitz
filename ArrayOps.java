public class ArrayOps {
    public static void main(String[] args) {

    }
    
    public static int findMissingInt (int[] array) {
        int len = array.length;
        int i = 0;
        // #feedback - j is not used.
        int j = 0;

        // #feedback - this code assumes that the array is sorted, which is not the case.
        while (i < len && array[i] == i) {
            i++;
        }
        return i;
    }

public static int secondMaxValue(int[] array) {
    int len = array.length;
    int i = 2;
    int bigger;
    int big;
    int new1;

    if (array[0] > array[1]) {
        bigger = array[0];
        big = array[1];
    } else {
        big = array[0];
        bigger = array[1];
    }

    while (i < len) {
        new1 = array[i];
        if (new1 > big && new1 >= bigger) {
            big = bigger;
            bigger = new1;
        } else if (new1 > big && new1 < bigger) {
            big = new1;
        }
        i++;
    }
    return big;
}
public static boolean containsTheSameElements(int[] array1, int[] array2) {
    boolean ans = true;
    int j = 0;
    int len1 = array1.length;
    int len2 = array2.length;

    // #feedback - you should also check the other direction - that elements in array2 are in array1.
    for (int i = 0; i<len1; i++) {
        for (j = 0; j<len2; j++) {
        if (array1[i] == array2[j]) {
            break;
        }
    }
     if (j==len2){
         // #feedback - you can return false directly instead of continuing the loop.
        ans = false;
     }
 }
 return ans;
}


public static boolean isSorted(int[] array) {
    int len = array.length;
    boolean ans = true;

    if(array[0]>array[1]){
        for (int i = 0; i<len - 1 ;i++ ) {
              if(array[i]<array[i+1]){
                ans = false;
                break;
        }
    }
}

  if(array[1]>array[0]){
    for (int i = 0; i < len - 1; i++) {
        if (array[i] > array[i + 1]) {
            ans = false;
            break;
        }
    }
}
return ans;

}
}
    
