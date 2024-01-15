public class ArrayOps {
    public static void main(String[] args) {

    }
    
    public static int findMissingInt (int[] array) {
        int len = array.length;
        int i = 0;
        int j = 0;

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
    int len1 = array1.length;
    int len2 = array2.length;

    if (len1 != len2) {
        return false;}

    boolean a;
    for (int i = 0; i < len1; i++) {
        a = false;

        for (int j = 0; j < len2; j++) {
            if (array1[i] == array2[j]) {
                a = true;
                break;}
        }

        if (a == false) {
            return false;}
    }
    for (int i = 0; i < len2; i++) {
        a = false;

        for (int j = 0; j < len1; j++) {
            if ((a == false) && (array2[i] == array1[j])) {
                a = true;
                break; }
        }

        if (a == false) {
            return false;}
    }

    return true;
}


  public static boolean isSorted(int[] array) {
    int i = 0;
    int len = array.length;

    while (i < len - 1) {
        if (array[i] < array[i + 1]) {
            i++;
        } else if (array[i] > array[i + 1]) {
            return false;
        } else {
            i++;
        }
    }

    return true;
}

}
