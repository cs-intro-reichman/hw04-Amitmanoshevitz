public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

  public static String capVowelsLowRest(String string) {
    int len = string.length();
    String newword = "";

    for (int i = 0; i < len; i++) {
        char cur = string.charAt(i);

        if (cur == 'a') {
            newword = newword + 'A';
        } else if (cur == 'e') {
            newword = newword + 'E';
        } else if (cur == 'i') {
            newword = newword + 'I';
        } else if (cur == 'o') {
            newword = newword + 'O';
        } else if (cur == 'u') {
            newword = newword + 'U';
        } else {
            // Convert other characters to lowercase
            int num = (int) cur;
            if (num >= 65 && num <= 90) {
                num = num + 32;
            }
            newword = newword + (char) num;
        }
    }

    return newword;
}

 
 public static String camelCase(String string) {
    String newword = "";

/// Changing the first letter to small letter
    char first = string.charAt(0);
    int num = (int) first;
    if (num >= 65 && num <= 90) {
        num = num + 32;
        char e = (char) num;
        newword = newword + e;
    } else {
        newword = newword + first;
    }

/// Changing the first letter of each word after the first word to capital letter,
/// erasing all spaces, and converting other letters to small letters
    boolean cap = false;

    for (int i = 1; i < string.length(); i++) {
        char currentchar = string.charAt(i);
        int num1 = (int) currentchar;

        if (num1 != 32) {
            if (cap) {
/// Changing the first letter after a space to capital
                if (num1 >= 97 && num1 <= 122) {
                    num1 = num1 - 32;}
                char con = (char) num1;
                newword = newword + con;
                cap = false;
            } else {
                if (num1 >= 65 && num1 <= 90) {
                    num1 = num1 + 32;
                }
                newword = newword + (char) num1;
                }
        }
}

    return newword;
}

    

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        int len = string.length();

        for (int i = 0; i < len ; i++) {
            char char1 = string.charAt(i);
            if (char1 == chr) {
                count++;
            }
        }
        
        int[] array1 = new int [count];
        int index = 0;

        for (int i = 0; i < len ; i++) {
            char char1 = string.charAt(i);
            if (char1 == chr) {
                array1[index] = i;
                index++;
            }
        }

        return array1;
    }
}
