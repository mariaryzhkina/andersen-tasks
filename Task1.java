public class Task1 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);

            if (num > 7) {
                System.out.println("Hello");
            } else {
                System.out.println("The number is less then 7");
            }
        } catch (Exception error){
            System.out.println("Incorrect number");
        }
    }
}
