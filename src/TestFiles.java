//Jazmine Freund
public class TestFiles {
    public static void main(String[] args){

        System.out.println("Hello Method Madness");
        System.out.println();

        System.out.println(JFreundLib.isPalindrome("racecar"));
        System.out.println(JFreundLib.isPalindrome("no"));
        System.out.println();

        System.out.println(JFreundLib.cutOut("catatonic cat", "cat"));
        System.out.println(JFreundLib.cutOut("really", "ll"));
        System.out.println();

        System.out.println(JFreundLib.dateStr("01/08/1999"));
        System.out.println(JFreundLib.dateStr("07/27/2001"));
        System.out.println();

        System.out.println(JFreundLib.vigCipher("lm", "ab"));
        System.out.println(JFreundLib.vigCipher("att ackatdawn", "iozqghiozqgh"));
        System.out.println();

        System.out.println(JFreundLib.stringUnion("hello", "hola", "nihao"));
        System.out.println(JFreundLib.stringUnion("jaz","zame","jam"));
        System.out.println();

        System.out.println(JFreundLib.sumUpTo(5));
        System.out.println(JFreundLib.sumUpTo(10));
        System.out.println();

        System.out.println(JFreundLib.quadSolver(1.0, 4.0,4.0 ));
        System.out.println(JFreundLib.quadSolver(1.0, -5.0,6.0 ));
        System.out.println();

        System.out.println(JFreundLib.primePrinter(2));
        System.out.println(JFreundLib.primePrinter(10));
        System.out.println();


        System.out.println(JFreundLib.leastCommonMultiple(2, 3, 5));
        System.out.println(JFreundLib.leastCommonMultiple(5, 6, 3));
        System.out.println();
    }
}