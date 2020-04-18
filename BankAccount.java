public class BankAccount {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Ewa";
        person1.lastName = "Kowlaska";
        person1.peselNumber = "1207254586";

        Account account1 = new Account();
        account1.owner = person1;
        account1.accountNumber = "12 1020 5252 1542 5821 2125";
        account1.balance = 1_500;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 10_000;
        credit1.interestRate = 0.15;
        credit1.termMonths = 36;

        System.out.println("Pani");
        System.out.println(person1.firstName + " " + person1.lastName + " numer pessel " + person1.peselNumber);
        System.out.println(" Posiada konto bankowe " + " numer " + account1.accountNumber + " Stan konta " + account1.balance);
        System.out.println(" Posiada kredyt w wysokości " + credit1.cashBorrowed + " oprocentowany " + credit1.interestRate + " na okres " + credit1.termMonths + " miesięcy");

    }
}
