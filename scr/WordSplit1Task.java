public class WordSplit1Task {
    public static void main(String[] args) {
        for (String text : args) {
           char[] convertedCharArray = text.toCharArray();
            for (Character ch : convertedCharArray) {
                System.out.println(ch);
            }
        }
    }

}
