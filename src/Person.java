public class Person {

    // Перерахування для статі
    enum Gender {
        MALE, FEMALE, OTHER
    }

    // Атрибути
    String name;
    byte age;         // Замість int — byte
    Gender gender;    // Новий атрибут

    // Метод 1
    public void sayHello() {
        System.out.println("Hello! My name is " + name);
    }

    // Метод 2
    public byte getAgeNextYear() {
        return (byte)(age + 1);  // потрібне приведення типу
    }

    // Метод 3 — вивід статі
    public void printGender() {
        System.out.println("Gender: " + gender);
    }
}