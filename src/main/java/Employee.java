public class Employee {
    private final String name;
    private final String surname;
    private final String middleName;
    private final String position;
    private final String email;
    private final String mobile;
    private final Double salary;
    private final int age;


    public Employee(String name, String surname, String middleName, String position, String email,
                    String mobile, Double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.age = age;

    }

    public void info() {
        System.out.println("ФИО: " + surname + ' ' + name + ' ' + middleName);
        System.out.println("Должность: " + position + "\n" + "Зарплата: " + salary + "$");
        System.out.println("email: " + email + "\n" + "Телефон: " + mobile + "\n" + "Возраст: " + age + "\n");
    }

    public int getAge() {
        return age;
    }
}
