package roles;


public class Reader implements  interfaces.Reader {


    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(roles.Administrator administrator) {
        System.out.println("Читатель " + name + " взял книги у администратора " +  administrator.getName());
    }

    @Override
    public void returnBook(roles.Administrator administrator) {
        System.out.println("Читатель " + name + " вернул книги администратору " + administrator.getName());
    }
}
