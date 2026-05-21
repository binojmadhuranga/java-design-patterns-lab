// Abstract Class
abstract class BankTransaction {

    // Template Method
    final void processTransaction() {

        login();
        validateUser();
        performTransaction();
        sendConfirmation();
    }

    void login() {
        System.out.println("User Logged In");
    }

    void validateUser() {
        System.out.println("User Validated");
    }

    abstract void performTransaction();

    void sendConfirmation() {
        System.out.println("Confirmation Sent");
    }
}