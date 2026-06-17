import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        HashMap<Integer, List<User>> users = new HashMap<>();
        for(int i = 1; i < 6; i++) {
            Scanner in = new Scanner(System.in);
            System.out.printf("Введите имя пользователя %d: ", i);
            String name = in.nextLine();
            System.out.printf("Введите возраст пользователя %d: ", i);
            int age = in.nextInt();
            if(users.containsKey(age)) {
                users.get(age).add(new User(name, age));
            }
            else {
                List<User> arr = new ArrayList<>();
                arr.add(new User(name, age));
                users.put(age, arr);
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите требуемый возраст: ");
        int age = in.nextInt();
        if(users.containsKey(age))
            for(User user : users.get(age))
                System.out.println(user.toString());
        else System.out.printf("Пользователь с возрастом '%d' не найден", age);
    }
}