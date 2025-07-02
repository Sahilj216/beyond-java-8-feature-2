import java.util.Objects;

public record Student(int id , String standard) {

    public Student{
        Objects.requireNonNull(standard, "Standard cannot be null");
        if (id <= 0  || standard.isBlank()) {
            throw new IllegalArgumentException("Invalid id or standard");
        }
    }

}
