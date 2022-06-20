package interfaces;

import interfaces.Administrator;
import roles.*;

public interface Reader  {



    void takeBook(roles.Administrator administrator);


    void returnBook(roles.Administrator administrator);
}

