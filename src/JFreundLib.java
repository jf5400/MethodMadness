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

        public static String quadSolver(Double a, Double b, Double c){
            if(((b^2)-(4*a*c))<0){
                return "The roots are imaginary.";
            }
            else{
                double pos=((-b)+((b^2)-(4*a*c))^(1/2))/(2*a);
                double neg=((-b)-((b^2)-(4*a*c))^(1/2))/(2*a);
                if(pos==neg){
                    return "The root is"+pos;
                }
                else{
                    return "The roots are"+pos+"and"+neg;
                }
            }
        }

}
