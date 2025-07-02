sealed class Person permits Student , Teacher{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }    
}

final class Student extends Person{
    private String standard;

    public Student(String name, int age, String standard) {
        super(name, age);
        this.standard = standard;
    }

    public String getStandard() {
        return standard;
    }
}

final class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    
}
