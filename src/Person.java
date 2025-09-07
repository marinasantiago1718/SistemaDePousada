public abstract class Person {
    private String name;
    private String phoneNumber;
    private String CPF;
    private String email;
    private String endereco;

    public Person(String name, String phoneNumber, String cPF, String email, String endereco) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        CPF = cPF;
        this.email = email;
        this.endereco = endereco;
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

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }
}
