public class JFreundLib {
    /**
     *
     * @param word
     * @return
     */
    public static Boolean isPalindrome(String word) {
        String rev = "";
        for (int i = word.length(); i > 0; i--) {
            rev = rev + word.substring(i - 1, i);
        }
        return (word.equals(rev));
    }

    /**
     *
     * @param mainStr
     * @param subStr
     * @return
     */
    public static String cutOut(String mainStr, String subStr) {
        int start=mainStr.indexOf(subStr);
        int len=subStr.length();
        return mainStr.substring(0,start) + mainStr.substring(start+len);
    }

    /**
     *
     * @param Message
     * @param Key
     * @return
     */
    public static String vigCipher(String Message, String Key){
        String alph="abcdefghijklmnopqrstuvwxyz";
        String newmessage="";
        for(int i=0; i<Message.length(); i++){
            String key=Key.substring(i, i+1);
            String mess=Message.substring(i, i+1);
            int add = alph.indexOf(key);
            int start = alph.indexOf(mess);
            newmessage+=alph.substring(start+add, start+add+1);
        }
        return newmessage;
    }

    public static String stringUnion(String word1, String word2, String word3){
        int len1=word1.length();
        int len2=word2.length();
        int len3=word3.length();
        String unionwords="";
        return word1;
    }

    /**
     *
     * @param n
     * @return
     */
    public static int sumUpTo(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
           sum+=i;
        }
        return sum;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static String quadSolver(Double a, Double b, Double c){
        double underparen = Math.pow(b,2.0)-(4*a*c);
        if(underparen<0){
            return "The roots are imaginary.";
        }
        else{
            double pos=(-b + Math.pow(underparen,(.5)))/(2*a);
            double neg=(-b - Math.pow(underparen,(.5)))/(2*a);
            if(pos==neg){
                return "The root is"+pos;
            }
            else {
                return "The roots are " + pos + " and " + neg;
            }
        }
    }

    /**
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int leastCommonMultiple(int num1, int num2, int num3){
        int i=1;
        while((i%num1!=0)||(i%num2!=0)||(i%num3!=0)){
            i++;
        }
        return i;
    }
}