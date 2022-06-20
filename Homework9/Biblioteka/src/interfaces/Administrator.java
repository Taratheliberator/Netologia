package interfaces;

public interface Administrator {
    void overdueNotification(roles.Reader reader);

    void searchingBook(roles.Reader reader);

    void givingBook(roles.Reader reader);
}
