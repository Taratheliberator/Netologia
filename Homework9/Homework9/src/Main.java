import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "jass", 24);
        User user2 = new User("tomas", "tomas@gmail.com", "tass", 35);
        User user3 = new User("roma", "roma@gmail.com", "rass", 17);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.login) & password.equals(user.password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18)
            throw new AccessDeniedException("Возраст менее 18 лет");

    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        getUserByLoginAndPassword(login, password);
        validateUser(getUserByLoginAndPassword(login, password));

        //Проверить логин и пароль

        //Вызвать методы валидации пользователя

        System.out.println("Доступ предоставлен");
    }
}
