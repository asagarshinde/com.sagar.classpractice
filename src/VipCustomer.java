public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default Name",10000.0,"Default email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default Email");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.email = email;
        this.creditLimit = creditLimit;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
