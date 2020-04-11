public class WordSplit2Task {
    public static void main(String[] args) {
        for (String text : args) {
            for (int i = 0; i < text.length(); ++i) {
                System.out.println(text.charAt(i));
            }
        }
    }
}


