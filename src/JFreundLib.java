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


    public static String stringUnion(String word1, String word2, String word3){
        int len1=word1.length();
        int len2=word2.length();
        int len3=word3.length();
        String unionwords="";
        return word1;
    }

    public static String quadSolver(Double a, Double b, Double c){
        double underparen = Math.pow(b,2.0)-(4*a*c);
        if(underparen<0){
            return "The roots are imaginary.";
        }
        else{
            double pos=(-b + Math.pow(underparen,(1/2)))/(2*a);
            double neg=(-b - Math.pow(underparen,(1/2)))/(2*a);
            return "The roots are "+pos+" and "+neg;
        }
    }

}
