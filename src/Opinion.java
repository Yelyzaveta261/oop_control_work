// Клас для представлення думки користувача
public class Opinion {
    // Унікальний ідентифікатор думки
    private int id;

    // Ім'я автора
    private String authorName;

    // Текст думки
    private String content;

    // Оцінка або рейтинг (наприклад, від 1 до 5)
    private int rating;

    // Конструктор класу
    public Opinion(int id, String authorName, String content, int rating) {
        this.id = id;
        this.authorName = authorName;
        this.content = content;
        this.rating = rating;
    }

    // Геттери та сеттери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}