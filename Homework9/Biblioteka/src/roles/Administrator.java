package roles;

public class Administrator implements interfaces.Administrator {

    private String name;

    public Administrator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " уведомляет:" + " читатель " + reader.getName() + " задолжал книгу");
    }


    public void searchingBook(Reader reader) {
        System.out.println("Администратор " + name + " ищет книгу" + " для читателя " + reader.getName());

    }

    @Override
    public void givingBook(Reader reader) {
        System.out.println("Администратор " + name + " выдал книгу читателю " + reader.getName());
    }
}
