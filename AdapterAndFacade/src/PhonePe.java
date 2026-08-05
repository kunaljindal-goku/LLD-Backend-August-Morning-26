public class PhonePe {

//    private YesBank yesBank;
//
//    public PhonePe(YesBank yesBank) {
//        this.yesBank = yesBank;
//    }
//
//    public void doTransaction(double amount, String account) {
//        yesBank.makePayment(amount,account);
//    }

    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void doTransaction(double amount, String account) {
        bankAPI.doTransaction(amount,account);
    }
}
