package engtelecom.poo.configuracoes;

// CLASSE QUE REPRESENTE O CONJUNTO DE CONFIGURAÇÕES DE UM PACOTE IP E UMA REGRA NA APLICAÇÃO

public class Configuracoes {
    private String enderecoIpOrigem;
    private String enderecoIpDestino;
    private int portaDeOrigem;
    private int portaDeDestino;

    // CONSTRUTOR DA CLASSE CONFIGURAÇÕES
    public Configuracoes(String enderecoIpOrigem, String enderecoIpDestino, int portaDeOrigem, int portaDeDestino) {
        this.enderecoIpOrigem = enderecoIpOrigem;
        this.enderecoIpDestino = enderecoIpDestino;
        this.portaDeOrigem = portaDeOrigem;
        this.portaDeDestino = portaDeDestino;
    }


    // GET ENDEREÇO IP DE ORIGEM
    public String getEnderecoIpOrigem() {
        return enderecoIpOrigem;
    }

    // GET ENDEREÇO IP DE DESTINO
    public String getEnderecoIpDestino() {
        return enderecoIpDestino;
    }

    // GET PORTA DE ORIGEM
    public int getPortaDeOrigem() {
        return portaDeOrigem;
    }

    // GET PORTA DE DESTINO
    public int getPortaDeDestino() {
        return portaDeDestino;
    }

}
