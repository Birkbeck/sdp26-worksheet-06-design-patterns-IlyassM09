package adapter;

public class XpayToPayDAdapter implements PayD {
    public XpayToPayDAdapter(Xpay xpay) {
        // TODO: implement
    }

    @Override
    public String getCustCardNo() {
        // TODO: implement
        return null;
    }

    @Override
    public String getCardOwnerName() {
        // TODO: implement
        return null;
    }

    @Override
    public String getCardExpMonthDate() {
        // TODO: implement
        return null;
    }

    @Override
    public int getCVVNo() {
        // TODO: implement
        return 0;
    }

    @Override
    public double getTotalAmount() {
        // TODO: implement
        return 0;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        // TODO: implement
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        // TODO: implement
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        // TODO: implement
    }

    @Override
    public void setCVVNo(int cVVNo) {
        // TODO: implement
    }

    @Override
    public void setTotalAmount(double totalAmount) {
        // TODO: implement
    }
}
