package adapter;

public class XpayToPayDAdapter implements PayD {

    private Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    @Override
    public String getCustCardNo() {
        return xpay.getCreditCardNo();
    }

    @Override
    public String getCardOwnerName() {
        // TODO: implement
        return xpay.getCustomerName();
    }

    @Override
    public String getCardExpMonthDate() {
        // TODO: implement
        return xpay.getCardExpMonth();
    }

    @Override
    public int getCVVNo() {
        // TODO: implement
        return xpay.getCardCVVNo();
    }

    @Override
    public double getTotalAmount() {
        // TODO: implement
        return xpay.getAmount();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        // TODO: implement
        xpay.setCreditCardNo(custCardNo);
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        // TODO: implement
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        // TODO: implement
        xpay.setCardExpMonth(cardExpMonthDate);
    }

    @Override
    public void setCVVNo(int cVVNo) {
        // TODO: implement
        xpay.setCardCVVNo((short) cVVNo);
    }

    @Override
    public void setTotalAmount(double totalAmount) {
        // TODO: implement
        xpay.setAmount(totalAmount);
    }
}
