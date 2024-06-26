public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 1990);
        Book java = new Book("Java", "James Gosling", 1995);
        Book python = new Book("Python", "Guido van Rossum", 1991);
        Book c = new Book("C", "Dennis Ritchie", 1972);
        Book cPlusPlus = new Book("C++", "Bjarne Stroustrup", 1983);
        library.addBook(harryPotter);
        library.addBook(java);
        library.addBook(python);
        library.addBook(c);
        library.addBook(cPlusPlus);
        library.printBooks();
        library.removeBook(c);
        library.removeBook(cPlusPlus);
        library.printBooks();
        System.out.println("-----------------------------------");
        library.searchBookForName("Java");
        library.searhBookForAuthor("Guido van Rossum");
        library.searchBookForName("C"); // не найдена т к я ее удалил выше)
        System.out.println();
        System.out.println("**********************************************");
        System.out.println();
        Bank bank = new Bank();
        BankAccount bankAccountAlex = new BankAccount("Alex", 1, 100, 1);
        BankAccount bankAccountDron = new BankAccount("Dron", 2, 200, 1);
        BankAccount bankAccountIlya = new BankAccount("Ilya", 3, 300, 1);
        bankAccountAlex.remainderMoney();
        bankAccountAlex.addMoney(-100);
        bankAccountAlex.addMoney(200);
        bankAccountAlex.withdrawMoney(50);
        bankAccountAlex.withdrawMoney(150);
        bankAccountAlex.transferMoney(bankAccountDron, 100);
        bankAccountDron.remainderMoney();
        bankAccountDron.transferMoney(bankAccountIlya, 400);
        bankAccountDron.transferMoney(bankAccountIlya, 250);
        bankAccountIlya.remainderMoney();
        System.out.println("-----------------------------------");
        bank.createAccount("Igor", 7, 1000, 1);
        bank.createAccount("Ivan", 8, 2000, 1);
        bank.addAccount(bankAccountAlex);
        bank.addAccount(bankAccountDron);
        bank.addAccount(bankAccountIlya);
        bank.printAllAccounts();
        bank.banAccount(bankAccountAlex);
        bank.banAccount(bankAccountDron);
        bank.banAccount(bankAccountIlya);
        bank.printAllAccounts();
        bank.unbanAccount(bankAccountDron);
        bank.unbanAccount(bankAccountIlya);
        bank.unbanAccount(bankAccountAlex);
        bank.printAllAccounts();
        bankAccountDron.addMoney(1000);
        bank.changeCredit(bankAccountDron, 500);
        bank.changeCredit(bankAccountAlex, 300);
        bank.changeCredit(bankAccountIlya, 400);
        bank.addProcentCredit(bankAccountDron);
        bank.printAllCredits();
        System.out.println("-----------------------------------");
        bank.printStaticAccount(bankAccountAlex);
        bank.addBonus(bankAccountAlex, 500);
        bank.printStaticAccount(bankAccountAlex);
        bankAccountAlex.printTransaction();
        bankAccountDron.printTransaction();
        System.out.println("-----------------------------------");
        bankAccountAlex.remainderMoney();
        bankAccountAlex.printCredit();
        bankAccountAlex.getCredit(100);
        bankAccountAlex.printTransaction();
        System.out.println();
        System.out.println("**********************************************");
        System.out.println();
        Company company = new Company();
        company.addIT(new IT("Valera", "Java-Developer", 5000));
        company.addIT(new IT("Igor", "Python-Developer", 2000));
        company.addIT(new IT("Ivan", "C++-Developer", 3000));
        company.addDesigner(new Designer("Dron", "Designer", 2000));
        company.addDesigner(new Designer("Petya", "Web-Designer", 2200));
        company.addDesigner(new Designer("Sasha", "Graphic-Designer", 2500));
        company.addManager(new Manager("Vova", "Manager", 3000));
        company.addManager(new Manager("Masha", "Manager", 3500));
        company.addManager(new Manager("Ilya", "Manager", 4000));
        company.listSpecialists();
        company.hiddenSalary();
        Company.avarageSalary(company);
        System.out.println("-----------------------------------");
        company.removeIT("Igor");
        company.removeDesigner("Dron");
        company.removeManager("Vova");
        company.listSpecialists();
        company.hiddenSalary();
        Company.avarageSalary(company);

    }
}