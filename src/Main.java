import java.util.Scanner;

class User {
    private String name;
    private Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setAge(Integer age) {this.age = age;}
    public Integer getAge() {return age;}

    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите имя первого пользователя: ");
        String name = in1.nextLine();
        System.out.print("Введите возраст первого пользователя: ");
        int age = in1.nextInt();
        User user1 = new User(name, age);

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите имя второго пользователя: ");
        name = in2.nextLine();
        System.out.print("Введите возраст второго пользователя: ");
        age = in2.nextInt();
        User user2 = new User(name, age);

        if(user1.getAge() > user2.getAge())
            System.out.println(user2.toString());
        else if(user1.getAge() < user2.getAge())
            System.out.println(user1.toString());
        else System.out.println("У пользователей одинаковый возраст");
    }
}