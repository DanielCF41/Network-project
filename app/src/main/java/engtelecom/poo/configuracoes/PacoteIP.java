package engtelecom.poo.configuracoes;

// CLASSE QUE REPRESENTA UM PACOTE IP

public class PacoteIP {
    private Configuracoes configuracoesPacoteIp;
    private String enderecoMacDestino;
    private String payload;

    // CONSTRUTOR DA CLASSE PACOTE IP
    public PacoteIP(Configuracoes configuracoesPacoteIp, String payload, String enderecoMacDestino) {
        this.configuracoesPacoteIp = configuracoesPacoteIp;
        this.payload = payload;
        this.enderecoMacDestino = enderecoMacDestino;
    }


    // GET CONFIGURAÇÕES
    public Configuracoes getConfiguracoesPacoteIp() {
        return configuracoesPacoteIp;
    }
    // GET ENDERECO MAC DESTINO
    public String getEnderecoMacDestino() {
        return enderecoMacDestino;
    }

}
