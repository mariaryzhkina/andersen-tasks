public class Task3 {
    public static void main(String[] args) {
        for (String stringNumber : args) {
            int number = Integer.parseInt(stringNumber);

            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
