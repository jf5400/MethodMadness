//Jazmine Freund
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
     * Subtracts 1 from num every time there is a prime.
     * Determines if number is prime by doing mod every numer from 2 to n-1.
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
     * Shifts each charcater in Message by the corresponding character's position on alph.
     *
     * @param Message the message being encrypted
     * @param Key the key used to encrypt the message
     * @return encypted message using the Vigenere Cipher
     */
    public static String vigCipher(String Message, String Key) {
        String alph = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String newmessage = "";
        for (int i = 0; i < Message.length(); i++) {
            String key = Key.substring(i, i + 1);
            String mess = Message.substring(i, i + 1);
            int add = alph.indexOf(key);
            int start = alph.indexOf(mess);
            if(start!=-1){
                newmessage += alph.substring(start + add, start + add + 1);
            }
        }
        return newmessage;
    }

    /**
     * Searches through word2 and word3 for letters that match those in word1.
     * Search through word3 for letters that match those in word2.
     * Check if the matched letter is already in the string keeping track of matched letters.
     *
     * @param word1 the first word being compared to the other two words
     * @param word2 the second word being compared to the other two words
     * @param word3 the third word being compared to the other two words
     * @return the number of unique letters shared by at least two of the words
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
     * Checks if the discriminant of the quadratic is less than 0 to see if roots are imaginary.
     * If the roots aren't imaginary plugs in a, b, and c in the quadratic formula.
     *
     * @param a th coefficient of x^2
     * @param b the coefficient of x
     * @param c the constant
     * @return a string with the roots of the quadratic equation or explaining that the roots are imaginary
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
     * Do i mod num1, num2, and num3 until the result is 0 for all three.
     *
     * @param num1 one of the numbers that needs to be a factor of the result
     * @param num2 one of the numbers that needs to be a factor of the result
     * @param num3 one of the numbers that needs to be a factor of the result
     * @return the least commone multiple shared by three numbers
     */
    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int i = 1;
        while ((i % num1 != 0) || (i % num2 != 0) || (i % num3 != 0)) {
            i++;
        }
        return i;
    }
}