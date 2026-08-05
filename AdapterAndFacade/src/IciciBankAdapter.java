import java.util.UUID;

public class IciciBankAdapter implements BankAPI{

    private IciciBank iciciBank;

    public IciciBankAdapter() {
        this.iciciBank = new IciciBank();
    }

    @Override
    public void doTransaction(double amount, String account) {
        String token = generateToken();
        iciciBank.sendMoney(account,token,amount);
    }

    private String generateToken() {
        return String.valueOf(UUID.randomUUID());
    }
}
