import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        String name = args[0];

        boolean namesAreEqual = Objects.equals(name, "Вячеслав");

        if (namesAreEqual) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
