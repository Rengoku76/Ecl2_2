
public class User {
    private String login;
    private String password;
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
    public class Query {
        public void printToLog() {
            System.out.println("������ ��������� �� ������������ � �������: " + login + " � �������: " + password);
        }
    }
    public static void main(String[] args) {
        User user = new User("login1", "password1");
        user.createQuery();
        User.Query query2 = new User("login2", "password2").new Query();
        query2.printToLog();
    }
}