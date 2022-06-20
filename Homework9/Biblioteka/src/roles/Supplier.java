package roles;

public class Supplier implements interfaces.Supplier, interfaces.Reader {


      private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void bookSupplying(roles.Supplier supplier) {
        System.out.println("Поставщик " + name + " привез книги");

    }


    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Читатель " + name + " взял книги у администратора " +  administrator.getName());
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Читатель " + name + " вернул книги администратору " + administrator.getName());
    }
}
