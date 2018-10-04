public class JFreundLib {

    public static Boolean isPalindrome(String word) {
        String rev = "";
        for (int i = word.length(); i > 0; i--) {
            rev = rev + word.substring(i - 1, i);
        }
        return (word.equals(rev));
    }

    public static String vigCipher(String Message, String Key){
        String alph="abcdefghijklmnopqrstuvwxyz";
        String newmessage="";
        for(int i=0; i<Message.length(); i++){
            int one =alph.indexOf(Message.substring(i, i+1));
            newmessage+=alph.substring(one);
        }
        return Message;
    }

    public static String stringUnion(String word1, String word2, String word3){
        int len1=word1.length();
        int len2=word2.length();
        int len3=word3.length();
        String unionwords="";

        return unionwords;
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

    public static int leastCommonMultiple(int num1, int num2, int num3){
        int i=1;
        while((i%num1!=0)&&()&&){


        }
    }




    public static int leastCommonMultiple(int num1, int num2, int num3){
        int multiple=1;
        String factors="";
        for(int n=1; n<=3; n++){
            int num=0;
            if(n==1){
                num=num1;
            }
            else if(n==2){
                num=num2;
            }
            else{
                num=num3;
            }
            for(int i=0; i<=num; i++){
                if(num%i==0){
                    if(factors.indexOf(i)==-1){
                        factors+=i;
                    }
                }
            }
        }
        int m=1;
        for(int k=0; k<factors.length(); k++){
            //int ran=factors.substring(k,k+1);
            multiple=multiple*m;
        }
        return multiple;
    }
}