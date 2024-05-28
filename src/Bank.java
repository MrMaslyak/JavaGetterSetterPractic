import java.util.ArrayList;

public class Bank {
    private boolean ban;
    private ArrayList<BankAccount> accounts;

    public Bank() {
        this.ban = false; // Початково банк не заблокований
        this.accounts = new ArrayList<>();
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public BankAccount createAccount(String user, int indexUser, int initialDeposit) {
        BankAccount newAccount = new BankAccount(user, indexUser, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Bank created new account for user: " + user + " with initial deposit: " + initialDeposit + "$");
        return newAccount;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("We register your account in our Bank - " + account.getUser() + " with initial deposit: " + account.getMoney() + "$"); ;
    }

    public void printAllAccounts() {
        System.out.println("-----------------------------------");
        System.out.println("All accounts in the bank:");
        for (BankAccount account : accounts) {
            System.out.println("Account: " + account.getUser() + ", Balance: " + account.getMoney() + "$, Index: " + account.getIndexUser());
        }
        System.out.println("-----------------------------------");
    }
    public void banAccount(BankAccount account){
        this.accounts.remove(account);
        System.out.println("Account " + account.getUser() + " is banned");
    }
    public void unbanAccount(BankAccount account){
        this.accounts.add(account);
        System.out.println("Account " + account.getUser() + " is unbanned");
    }
}
