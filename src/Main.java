import java.util.ArrayList;
import java.util.Comparator;
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
        ArrayList<User> users = new ArrayList<>();
        for(int i = 1; i < 6; i++) {
            Scanner in = new Scanner(System.in);
            System.out.printf("Введите имя пользователя %d: ", i);
            String name = in.nextLine();
            System.out.printf("Введите возраст пользователя %d: ", i);
            int age = in.nextInt();
            users.add(new User(name, age));
        }

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return Integer.compare(user1.getAge(), user2.getAge());
            }
        });

        for(User user : users) {
            System.out.println(user.toString());
        }
    }
}