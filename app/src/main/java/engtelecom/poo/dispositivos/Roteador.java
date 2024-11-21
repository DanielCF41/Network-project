package engtelecom.poo.dispositivos;

// CLASSE QUE REPRESENTA UM ROTEADOR NA APLICAÇÃO

import engtelecom.poo.Dispositivo;
import engtelecom.poo.Rota;
import engtelecom.poo.configuracoes.PacoteIP;

import java.util.ArrayList;

public class Roteador extends Dispositivo {
    private ArrayList<Rota> rotas;

    // CONSTRUTOR DA CLASSE ROTEADOR
    public Roteador(String enderecoMac, String enderecoIp) {
        super(enderecoMac, enderecoIp);
        this.rotas = new ArrayList<>();
    }
    // CRIA ROTA PARA O ROTEADOR
    public void adicionarRota(int id, int portaAssociada){
        rotas.add(new Rota(id, portaAssociada));
    }
    // GET ARRAY DE ROTA
    public ArrayList<Rota> getRotas() {
        return rotas;
    }

    // PROCESSMANETO DE PACOTE - ROTEADOR
    // 0 - ENVIA PARA UMA REDE CONHECIDA
    // 1 - ENVIA PARA A PORTA PADRÃO
    // -1 - PACOTE IP null
    public int processarPacote(PacoteIP pacoteIP){
        if(pacoteIP != null) {
            for (int i = 0; i < rotas.size(); i++) {
                if (Integer.toString(rotas.get(i).getId()).charAt(0) == pacoteIP.getConfiguracoesPacoteIp().getEnderecoIpDestino().charAt(0) ) {
                    return 0;
                }
            }
            return 1;
        }else{
            return -1;
        }
    }


}
