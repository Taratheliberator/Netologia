public interface Administrator {
    void overdueNotification(Reader reader);

    void searchingBook(Reader reader);

    void givingBook(Reader reader);
}
