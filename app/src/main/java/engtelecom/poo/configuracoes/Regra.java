package engtelecom.poo.configuracoes;

// CLASSE QUE REPRESENTA UM REGRA DO FIREWALL NA APLICAÇÃO

public class Regra {
    private Configuracoes configuracoesRegra;
    private String acao;


    // CONSTRUTOR DA CLASSE REGRA
    public Regra(Configuracoes configuracoesRegra, String acao) {
        this.configuracoesRegra = configuracoesRegra;
        this.acao = acao;
    }


    // GET CONFIGURAÇÕES
    public Configuracoes getConfiguracoesRegra() {
        return configuracoesRegra;
    }
    // GET AÇÃO
    public String getAcao() {
        return acao;
    }

}
