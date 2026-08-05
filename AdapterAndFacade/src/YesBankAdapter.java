public class YesBankAdapter implements BankAPI{

    private YesBank yesBank;

    public YesBankAdapter() {
        this.yesBank = new YesBank();
    }

    @Override
    public void doTransaction(double amount, String account) {
        yesBank.makePayment(amount,account);
    }
}
