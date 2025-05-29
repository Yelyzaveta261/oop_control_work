public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Opinion
        Opinion opinion1 = new Opinion(1, "Ліза", "Мені дуже сподобалось!", 5);
        Opinion opinion2 = new Opinion(2, "Олексій", "Нормально, але можна краще.", 3);

        // Виведення думок у консоль
        System.out.println(opinion1);
        System.out.println(opinion2);
    }
}
