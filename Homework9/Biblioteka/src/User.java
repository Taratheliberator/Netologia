
import roles.*;

public class User {
    public static void main(String[] args) {

        Administrator administrator = new Administrator("����");

        Reader reader = new Reader("�����");

        Librarian librarian = new Librarian("�����");

        Supplier supplier = new Supplier("�����");

        administrator.overdueNotification(reader); // ����������� � ��������������
        reader.takeBook(administrator); //�������� ���� ����� � ��������������
        librarian.bookOrdering( supplier);// ������������ ������� ����� � ����������

        supplier.takeBook(administrator); // ��������� ���� ��������� � ���� ����� �� ����������
        librarian.searchingBook(reader);//������������ ���� ��������������� � ���� ����� ��������
    }
}
