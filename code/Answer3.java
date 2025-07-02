import java.util.Objects;
public class Answer3 {

   public static void main(String[] args) {
       Student student1 = new Student(1, "10th Grade");
       Student student2 = new Student(2, "12th Grade");
       System.out.println("hashCode of Student 1 is: "+student1.hashCode());
       System.out.println("hashcode of Student 2 is: "+student2.hashCode());
       System.out.println(student1.equals(student2)); // false
   } 
}

record Student(int id, String standard) {

    public Student{
        Objects.requireNonNull(standard, "Standard cannot be null");
        if (id <= 0  || standard.isBlank()) {
            throw new IllegalArgumentException("Invalid id or standard");
        }
    }

}
