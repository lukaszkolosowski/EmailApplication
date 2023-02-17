package emailapp;

public class EmailApp {
    /* Email application

    SCENARIO:
    You are an IT Support Administrator Specialist and are charged with the task of creating aemial accounts for new hires.

        Generate an email with the following syntax: firstname.lastname@department.company.com.
        Determine the department(sales, development, accounting), if none leave blank.
        Generate a random 'String' for password.
        Have set methods to change the password, set the mailbox capacity, and define an alternate email address.
        Have get methods to display the name, email, and mailbox capacity.
        */

    public static void main(String[] args) {

        Email email1 = new Email("Lukas", "Kolosowski");
        email1.setMailboxCapacity(1500);
        email1.changePassword("Wakacje 2023");
        System.out.println(email1.showInfo());

    }
}
