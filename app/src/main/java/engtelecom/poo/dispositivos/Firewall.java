package engtelecom.poo.dispositivos;

// CLASSE QUE REPRESENTE O FIREWALL NA APLICAÇÃO

import engtelecom.poo.Dispositivo;
import engtelecom.poo.configuracoes.Configuracoes;
import engtelecom.poo.configuracoes.PacoteIP;
import engtelecom.poo.configuracoes.Regra;

import java.util.ArrayList;

public class Firewall extends Dispositivo {
    private ArrayList<Regra> regrasDeFiltragem;

    // CONSTRUTOR DA CLASSE FIREWALL
    public Firewall(String enderecoMac, String enderecoIp){
        super(enderecoMac, enderecoIp);
        this.regrasDeFiltragem = new ArrayList<>();
        this.regrasDeFiltragem.add(new Regra(new Configuracoes("1987","2134", 1,1), "Permitir envio"));
    }


    // GET REGRAS
    public ArrayList<Regra> getRegrasDeFiltragem() {
        return regrasDeFiltragem;
    }

    public void criarRegra(String enderecoIpOrigem, String enderecoIpDestino, int portaOrigem, int portaDestino, String acao){
        Regra regraAux = new Regra(new Configuracoes(enderecoIpOrigem,enderecoIpDestino,portaOrigem,portaDestino), acao);
        regrasDeFiltragem.add(regraAux);
    }

    public void apagarRegra(int i){
        Regra regraAux = regrasDeFiltragem.get(i);
        regrasDeFiltragem.remove(regraAux);
    }

    // PROCESSAMENTO DE PACOTE - FIREWALL
    // i - INDICE DA REGRA
    // -1 - DESCARTE DO PACOTE
    // -2 - PACOTE IP null
    public int processarPacote(PacoteIP pacoteIP){
        if(pacoteIP != null){
            for (int i = 0; i < regrasDeFiltragem.size(); i++) {
                if (pacoteIP.getConfiguracoesPacoteIp().getEnderecoIpOrigem().equals(regrasDeFiltragem.get(i).getConfiguracoesRegra().getEnderecoIpOrigem())) {
                    if(pacoteIP.getConfiguracoesPacoteIp().getPortaDeOrigem() == regrasDeFiltragem.get(i).getConfiguracoesRegra().getPortaDeOrigem()){
                        if(pacoteIP.getConfiguracoesPacoteIp().getEnderecoIpDestino().equals(regrasDeFiltragem.get(i).getConfiguracoesRegra().getEnderecoIpDestino())){
                            if(pacoteIP.getConfiguracoesPacoteIp().getPortaDeDestino() == regrasDeFiltragem.get(i).getConfiguracoesRegra().getPortaDeDestino()){
                                return i;
                            }
                        }
                    }
                }
            }
            return -1;
        }else{
            return  -2;
        }
    }
}
