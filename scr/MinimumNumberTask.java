public class MinimumNumberTask {
    public static void main(String[] args) {
        int minNumber = Integer.parseInt(args[0]);

        for (String currentOrder : args) {
            int singleArg = Integer.parseInt(currentOrder);
            if (singleArg < minNumber) {
                minNumber = singleArg;
            }
        }
        System.out.println(minNumber);
    }
}


