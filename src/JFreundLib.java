public class JFreundLib {

    //String Methods

    /**
     * Makes a list of the reverse of word.
     * Checks if both lists are equal.
     *
     * @param word the word that is being checked if it's a Palidrome
     * @return a boolean result about whether word is a Palidrome or not
     */
    public static Boolean isPalindrome(String word) {
        String rev = "";
        for (int i = word.length(); i > 0; i--) {
            rev = rev + word.substring(i - 1, i);
        }
        return (word.equals(rev));
    }

    /**
     * Puts date into a new format.
     *
     * @param date a string in the format “mm/dd/yyyy”
     * @return the string in the format “dd–mm-yyyy”
     */
    public static String dateStr(String date) {
        String month=date.substring(0,2);
        String days=date.substring(3,5);
        String year=date.substring(6);
        return days+"-"+month+"-"+year;
    }

    /**
     * Finds the length of subStr and the first time subStr occurs in mainStr.
     * Removes the characters from index to length-1.
     *
     * @param mainStr the string to search through
     * @param subStr the string being searched for
     * @return mainStr with subStr removed
     */
    public static String cutOut(String mainStr, String subStr) {
        int start = mainStr.indexOf(subStr);
        int len = subStr.length();
        return mainStr.substring(0, start) + mainStr.substring(start + len);
    }

    //Math Methods
    /**
     * Adds together every number from 0 to n.
     *
     * @param n number to sum up to
     * @return sum of the numbers from 0 to n
     */
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 
     *
     * @param num the number of primes that are being printed
     * @return the first num prime numbers.
     */
    public static String primePrinter(int num){
        if(num==0){
            return "";
        }
        String primelist="2 ";
        int j=3;
        int determine=0;
        while(num-1>0){
            for(int i=2;i<j;i++) {
                if (j % i == 0) {
                    determine+=1;
                }
            }
            if(determine==0){
                num = num-1;
                primelist = primelist + j+" ";
            }
            j=j+1;
            determine=0;
        }
        return primelist;
    }
    //Extra Credit

    /**
     * @param Message
     * @param Key
     * @return
     */
    public static String vigCipher(String Message, String Key) {
        String alph = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String newmessage = "";
        for (int i = 0; i < Message.length(); i++) {
            String key = Key.substring(i, i + 1);
            String mess = Message.substring(i, i + 1);
            int add = alph.indexOf(key);
            int start = alph.indexOf(mess);
            newmessage += alph.substring(start + add, start + add + 1);
        }
        return newmessage;
    }

    /**
     * @param word1
     * @param word2
     * @param word3
     * @return
     */
    public static int stringUnion(String word1, String word2, String word3) {
        String unionwords = "";
        for (int i = 0; i < word1.length(); i++) {
            if (word2.indexOf(word1.substring(i, i + 1)) != -1) {
                if (unionwords.indexOf(word1.substring(i, i + 1)) == -1) {
                    unionwords += word1.substring(i, i + 1);
                }
            }
            if (word3.indexOf(word1.substring(i, i + 1)) != -1) {
                if (unionwords.indexOf(word1.substring(i, i + 1)) == -1) {
                    unionwords += word1.substring(i, i + 1);
                }
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            if (word3.indexOf(word2.substring(i, i + 1)) != -1) {
                if (unionwords.indexOf(word2.substring(i, i + 1)) == -1) {
                    unionwords += word2.substring(i, i + 1);
                }
            }
        }
        return unionwords.length();
    }
    /**
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static String quadSolver(Double a, Double b, Double c) {
        double underparen = Math.pow(b, 2.0) - (4 * a * c);
        if (underparen < 0) {
            return "The roots are imaginary.";
        } else {
            double pos = (-b + Math.pow(underparen, (.5))) / (2 * a);
            double neg = (-b - Math.pow(underparen, (.5))) / (2 * a);
            if (pos == neg) {
                return "The root is" + pos;
            } else {
                return "The roots are " + pos + " and " + neg;
            }
        }
    }

    /**
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int i = 1;
        while ((i % num1 != 0) || (i % num2 != 0) || (i % num3 != 0)) {
            i++;
        }
        return i;
    }
}