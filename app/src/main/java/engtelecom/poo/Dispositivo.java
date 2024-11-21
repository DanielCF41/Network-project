package engtelecom.poo;

// CLASSE MAIS ABSTRATA DO SISTEMA

public abstract class Dispositivo {
    private String enderecoMac;
    private String enderecoIp;

    // CONSTRUTOR DA CLASSE DISPOSITIVO
    public Dispositivo(String enderecoMac, String enderecoIp) {
        this.enderecoMac = enderecoMac;
        this.enderecoIp = enderecoIp;
    }


    // GET ENDEREÇO MAC
    public String getEnderecoMac() {
        return enderecoMac;
    }
    // GET ENDEREÇO IP
    public String getEnderecoIp() {
        return enderecoIp;
    }


    // SET ENDEREÇO MAC
    public void setEnderecoMac(String enderecoMac) {
        this.enderecoMac = enderecoMac;
    }
    // SET ENDEREÇO IP
    public void setEnderecoIp(String enderecoIp) {
        this.enderecoIp = enderecoIp;
    }

}
