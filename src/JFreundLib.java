public class JFreundLib {

        public static Boolean isPalindrome(String word){
            String rev="";
            for(int i=word.length(); i>0; i--){
                rev=rev+word.substring(i-1,i);
            }
            return (word.equals(rev));
        }
        public static String stringUnion(String word1, String word2, String word3){
            int len1=word1.length();
            int len2=word2.length();
            int len3=word3.length();
            return word1;
        }

}
