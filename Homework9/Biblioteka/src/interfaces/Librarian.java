package interfaces;

import roles.Reader;

public interface Librarian {

    void bookOrdering(roles.Supplier supplier);

    void searchingBook(Reader reader);
}

