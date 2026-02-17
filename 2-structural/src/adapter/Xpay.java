package adapter;

public interface Xpay {

    String getCreditCardNo();

    String getCustomerName();

    String getCardExpMonth();

    String getCardExpYear();

    short getCardCVVNo();

    double getAmount();

    void setCreditCardNo(String creditCardNo);

    void setCustomerName(String customerName);

    void setCardExpMonth(String cardExpMonth);

    void setCardExpYear(String cardExpYear);

    void setCardCVVNo(short cardCVVNo);

    void setAmount(double amount);
}