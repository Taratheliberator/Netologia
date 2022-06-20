
package roles;

public class Librarian implements interfaces.Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void bookOrdering(roles.Supplier supplier) {
        System.out.println("������������ " + name + " ������� ����� " + "� " + "���������� " + supplier.getName());
    }

    @Override
    public void searchingBook(Reader reader) {
        System.out.println("������������� " + name + " ���� �����" + " ��� �������� " + reader.getName());
    }
}
