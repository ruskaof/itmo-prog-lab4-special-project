package abstract_things;

public class Narrator { // Класс для того, чтобы говорить о событиях, которые моделируются программой
    private Narrator(){}

    public static void tell(String message) {
        System.out.println(message);
    }
}
