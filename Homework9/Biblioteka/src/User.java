
import roles.*;

public class User {
    public static void main(String[] args) {

        Administrator administrator = new Administrator("Джон");

        Reader reader = new Reader("Томас");

        Librarian librarian = new Librarian("Лукас");

        Supplier supplier = new Supplier("Майкл");

        administrator.overdueNotification(reader); // уведомление о просроченности
        reader.takeBook(administrator); //читатель взял книги у администратора
        librarian.bookOrdering( supplier);// библиотекарь заказал книги у поставщика

        supplier.takeBook(administrator); // Поставщик стал читателем и взял книги из библиотеки
        librarian.searchingBook(reader);//библиотекарь стал администратором и ищет книгу читателю
    }
}
