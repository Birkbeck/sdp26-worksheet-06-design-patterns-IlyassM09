package proxy.virtual;

public class Company {
    private final String companyName;
    private final String companyAddress;
    private final String companyContactNo;
    private final ContactList contactList;

    public Company(String companyName, String companyAddress,
                   String companyContactNo, ContactList contactList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;

        System.out.println("Company object created...");
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyContactNo() {
        return companyContactNo;
    }

    public ContactList getContactList() {
        return contactList;
    }
}