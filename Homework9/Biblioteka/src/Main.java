public class Main {
    public static void main(String[] args) {

        Administrator administrator = new User("����");

        Reader reader = new User("�����");

        Librarian librarian = new User("�����");

        Supplier supplier = new User("�����");

        administrator.overdueNotification(reader); // ����������� � ��������������
        reader.takeBook(administrator); //�������� ���� ����� � ��������������
        librarian.bookOrdering(supplier);// ������������ ������� ����� � ����������

        ((Reader) supplier).takeBook(administrator); // ��������� ���� ��������� � ���� ����� �� ����������
        ((Administrator) librarian).searchingBook(reader);//������������ ���� ��������������� � ���� ����� ��������
    }
}
