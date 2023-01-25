package Logical.Program;

public class Reverse {
    public static void main(String[] args) {
        String sentence = "Reddy";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
    }

    static String reverse(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;

    }
    return reverse(sentence.substring(1))+sentence.charAt(0);
}

}
