
package dbTest;

//import org.junit.Test;


import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

    // MySQL Connector �� Ŭ����. DB ���� ����̹� ����
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // DB ���
    private static final String URL = "jdbc:mysql://localhost:3306/�����ͺ��̽�?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    //@Test
    public void testConnection() throws Exception {
        // DBMS���� DB ���� ����̹��� ��ġ�� �˷��ֱ� ���� �޼ҵ�
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}