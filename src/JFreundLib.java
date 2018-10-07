public class JFreundLib {

    //String Methods

    /**
     * @param word
     * @return a boolean
     */
    public static Boolean isPalindrome(String word) {
        String rev = "";
        for (int i = word.length(); i > 0; i--) {
            rev = rev + word.substring(i - 1, i);
        }
        return (word.equals(rev));
    }

    /**
     * @param mainStr
     * @param subStr
     * @return
     */
    public static String cutOut(String mainStr, String subStr) {
        int start = mainStr.indexOf(subStr);
        int len = subStr.length();
        return mainStr.substring(0, start) + mainStr.substring(start + len);
    }

    //Math Methods
    /**
     * @param n
     * @return
     */
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

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