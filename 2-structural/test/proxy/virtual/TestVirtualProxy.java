package proxy.virtual;

public class TestVirtualProxy {
    public static void main(String[] args) {
        Company company = new Company(
                "ABC Company",
                "India",
                "+91-011-28458965",
                new ContactListProxyImpl());

        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Company Address: " + company.getCompanyAddress());
        System.out.println("Company Contact No.: " + company.getCompanyContactNo());

        System.out.println("Requesting for contact list");

        ContactList contactList = company.getContactList();
        for (Employee emp : contactList.getEmployeeList()) {
            System.out.println(emp);
        }
    }
}
