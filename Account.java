public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public String getpassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{username:'" + username + "', password:'" + password + "'}";
    }
}
