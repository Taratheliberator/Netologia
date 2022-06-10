public class User implements Reader, Librarian, Supplier, Administrator {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void overdueNotification(Reader reader) {

        System.out.println("Администратор " + name + " уведомляет:" + " читатель " + ((User) reader).name + " задолжал книгу");
    }

    @Override
    public void searchingBook(Reader reader) {

        System.out.println("Администратор " + name + " ищет книгу" + " для читателя " + ((User) reader).name);
    }

    @Override
    public void givingBook(Reader reader) {

        System.out.println("Администратор " + name + " выдал книгу читателю " + ((User) reader).name);
    }

    @Override
    public void bookOrdering(Supplier supplier) {

        System.out.println("Библиотекарь " + name + " заказал книги " + "у " + "поставщика " + ((User) supplier).name);
    }


    @Override
    public void bookSupplying(Supplier supplier) {
        System.out.println("Поставщик " + name + " привез книги");
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Читатель " + name + " взял книги у администратора " + ((User) administrator).name);

    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Читатель " + name + " вернул книги администратору " + ((User) administrator).name);

    }
}
