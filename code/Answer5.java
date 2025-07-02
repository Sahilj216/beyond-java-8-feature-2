public class Answer5 {
  public static void main(String[] args) {
    Person s = new Student("Ram");
    Person t = new PermanentTeacher("Anuj");
    Person c = new Contractor("Shankar");

    System.out.println("Student class: " + s.getClass().getSimpleName());
    System.out.println("Teacher class: " + t.getClass().getSimpleName());
    System.out.println("Contractor class: " + c.getClass().getSimpleName());
  }

}

// Sealed base class: only specific classes can extend this
sealed class Person permits Student, Teacher, Contractor {
  protected final String name;

  public Person(String name) { this.name = name; }

  public String name() { return name; }
}

// Final subclass: cannot be extended further
final class Student extends Person {
  public Student(String name) { super(name); }
}

// Sealed subclass: only specific children allowed
sealed class Teacher extends Person permits PermanentTeacher {
  public Teacher(String name) { super(name); }
}

// Final subclass of Teacher
final class PermanentTeacher extends Teacher {
  public PermanentTeacher(String name) { super(name); }
}

// Non-sealed subclass: can be extended by anyone
non-sealed class Contractor extends Person {
  public Contractor(String name) { super(name); }
}
