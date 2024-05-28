public class BankAccount {
    private String user;
    private int money;
    private int indexUser;

    public BankAccount(String user, int indexUser, int money) {
        this.user = user;
        this.indexUser = indexUser;
        this.money = money;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getIndexUser() {
        return indexUser;
    }

    public void setIndexUser(int indexUser) {
        this.indexUser = indexUser;
    }

    public void addMoney(int money){
        if (money < 0) {
            System.out.println("You can't add a negative number");
            return;
        }
        this.setMoney(this.getMoney() + money);
        System.out.println(this.getUser() + " you added " + money + "$ to your account");
        System.out.println(this.getUser() + " your balance is " + this.getMoney() + "$");
    }

    public void withdrawMoney(int money){
        if (money > 0 && money <= this.getMoney()) {
            this.setMoney(this.getMoney() - money);
            System.out.println(this.getUser() + " you withdrew " + money + "$ from your account");
            System.out.println(this.getUser() + " your balance is " + this.getMoney() + "$");
        } else {
            System.out.println(this.getUser() + " you don't have enough money");
        }
    }

    public void remainderMoney(){
        System.out.println(this.getUser() + " your balance is " + this.getMoney() + "$");
        System.out.println(this.getUser() + " your index is " + this.getIndexUser());
    }

    public void transferMoney(BankAccount bankAccount, int money){
        if (money > 0 && money <= this.getMoney()) {
            this.setMoney(this.getMoney() - money);
            bankAccount.setMoney(bankAccount.getMoney() + money);
            System.out.println(this.getUser() + " you transferred " + money + "$ to Id Account " + bankAccount.getIndexUser() + "; User: " + bankAccount.getUser());
            System.out.println(this.getUser() + " your balance is " + this.getMoney() + "$");
        } else {
            System.out.println(this.getUser() + " you don't have enough money");
        }
    }
}
