public class Website {
    private Account[] accounts;
    public Website() {
        accounts = new Account[0];
    }

    public Account addAccount(String username, String password) {
        boolean UsernameTersedia = true;
        for (Account account : accounts) {
            if (account.getusername().equals(username)) {
                System.out.println("Mohon maaf username telah digunakan");
                UsernameTersedia = false;
                break;
            }
        }
        if (UsernameTersedia) {
            Account newAccount = new Account(username, encrypt(password));
            addItem(newAccount);
            System.out.println("Akun berhasil ditambahkan!");
            return newAccount;
        } else {
            return null;
        }
    }
    private void addItem(Account account) {
        Account[] newAccount = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newAccount[i] = accounts[i];
        }
        newAccount[accounts.length] = account;
        accounts = newAccount;
    }
    private String encrypt(String password) {
        String encryptedPassword = "";
        for (int i = 0; i < password.length(); i++) {
            int asciiValue = (int) password.charAt(i);
            asciiValue += 6 * Math.pow(-1, i);
            encryptedPassword += (char) asciiValue;
        }
        return encryptedPassword;
    }

    public void login(String username, String password) {
        for (Account account : accounts) {
            if (account.getusername().equals(username)) {
                if (account.getpassword().equals(encrypt(password))) {
                    System.out.println("Login berhasil!");
                    return;
                } else {
                    System.out.println("Akun tidak ditemukan!");
                    return;
                }
            }
        }
    }
}
