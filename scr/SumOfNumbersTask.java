public class SumOfNumbersTask {
    public static void main(String[] args) {
        double sum = 0;
        for (String currentArray : args) {
            sum += Double.parseDouble(currentArray);
        }
        System.out.println(sum);
    }
}
