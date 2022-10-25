public class Main {

    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");


        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCompanyName("Arçelik");
        company.setId(100);
        
        Person person = new Person();
        person.setNationalIdentity("11111");
        person.setFirstName("Engin");
        person.setLastName("Demiroğ");

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();

    }

}