public class JFreundLib {

    public static Boolean isPalindrome(String word){
        String rev="";
        for(int i=word.length(); i>-1; i--){
            rev = rev + word.substring(i,i+1);
        }
        if(word.compareTo(rev)){
            return true;
        }
        else{
            return false;
        }
    }

    public static String vigCipher(String Message, String Key){
        String alph="abcdefghijklmnopqrstuvwxyz";
        String newmessage="";
        for(int i=0; i<Message.length(); i++){
            int one =alph.indexOf(Message.substring(i, i+1));
            newmessage+=alph.substring(one+Key);
        }
        return Message;
    }

    public static String stringUnion(String word1, String word2, String word3){
        int len1=word1.length();
        int len2=word2.length();
        int len3=word3.length();
        return word1;
    }

    public static String quadSolver(Double a, Double b, Double c){
        return;
    }

    public static int leastCommonMultiple(int num1, int num2, int num3){
       
    }

}