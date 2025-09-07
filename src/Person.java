public abstract class Person {
    protected String name;
    protected String phoneNumber;
    protected String CPF;
    protected String email;
    protected String adress;

    public Person(String name, String phoneNumber, String cPF, String email, String endereco) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        CPF = cPF;
        this.email = email;
        this.adress = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return this.adress;
    }


}
