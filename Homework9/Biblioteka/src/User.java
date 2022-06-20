public class User implements Reader, Librarian, Supplier, Administrator {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void overdueNotification(Reader reader) {

        System.out.println("������������� " + name + " ����������:" + " �������� " + ((User) reader).name + " �������� �����");
    }

    @Override
    public void searchingBook(Reader reader) {

        System.out.println("������������� " + name + " ���� �����" + " ��� �������� " + ((User) reader).name);
    }

    @Override
    public void givingBook(Reader reader) {

        System.out.println("������������� " + name + " ����� ����� �������� " + ((User) reader).name);
    }

    @Override
    public void bookOrdering(Supplier supplier) {

        System.out.println("������������ " + name + " ������� ����� " + "� " + "���������� " + ((User) supplier).name);
    }


    @Override
    public void bookSupplying(Supplier supplier) {
        System.out.println("��������� " + name + " ������ �����");
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("�������� " + name + " ���� ����� � �������������� " + ((User) administrator).name);

    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("�������� " + name + " ������ ����� �������������� " + ((User) administrator).name);

    }
}
