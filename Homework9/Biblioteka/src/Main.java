public class Main {
    public static void main(String[] args) {

        Administrator administrator = new User("Джон");

        Reader reader = new User("Томас");

        Librarian librarian = new User("Лукас");

        Supplier supplier = new User("Майкл");

        administrator.overdueNotification(reader); // уведомление о просроченности
        reader.takeBook(administrator); //читатель взял книги у администратора
        librarian.bookOrdering(supplier);// библиотекарь заказал книги у поставщика

        ((Reader) supplier).takeBook(administrator); // Поставщик стал читателем и взял книги из библиотеки
        ((Administrator) librarian).searchingBook(reader);//библиотекарь стал администратором и ищет книгу читателю
    }
}
