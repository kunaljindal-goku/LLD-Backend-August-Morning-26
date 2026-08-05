public class Clinet {

    public static void main(String[] args) {

        BankAPI bankAPI = new IciciBankAdapter();
        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.doTransaction(1000,"21913");
    }
}
