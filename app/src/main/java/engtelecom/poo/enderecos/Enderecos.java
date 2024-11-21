package engtelecom.poo.enderecos;

public enum Enderecos {
    C1("C1", "1987"),
    A1("A1", "1023"), A2("A2", "1546"),
    A3("A3", "1879"), A4("A4", "1902"),

    C2("C2", "2890"),
    B1("B1", "2134"), B2("B2", "2256"),
    B3("B3", "2345"), B4("B4", "2678"),

    R1("R1", "3147"), F1("F1", "3239");

    private String enderecoMac;
    private String enderecoIp;

    Enderecos(String enderecoMac, String enderecoIp) {
        this.enderecoMac = enderecoMac;
        this.enderecoIp = enderecoIp;
    }

    public String getEnderecoMac() {
        return enderecoMac;
    }

    public String getEnderecoIp() {
        return enderecoIp;
    }
}