package engtelecom.poo.dispositivos;

// CLASSE QUE REPRESENTA UM COMUTADOR NA APLICAÇÃO

import engtelecom.poo.Dispositivo;
import engtelecom.poo.configuracoes.PacoteIP;

import java.util.ArrayList;

public class Comutador extends Dispositivo {
    private ArrayList<Dispositivo> portas;

    // CONSTRUTOR DA CLASSE COMUTADOR
    public Comutador(String enderecoMac, String enderecoIp) {
        super(enderecoMac, enderecoIp);
        this.portas = new ArrayList<>(12);
    }


    // GET ARRAY DE PORTAS
    public ArrayList<Dispositivo> getPortas() {
        return portas;
    }

    // SET ARRAY DE PORTAS
    public void setPortas(ArrayList<Dispositivo> portas) {
        this.portas = portas;
    }

    // PROCESSAMENTO DE PACOTE IP - COMUTADOR
    // 0 - ENDEREÇO MAC ENCONTRADO NA SUA REDE
    // 1 - ENDEREÇO MAC NÃO ENCONTRADO (ENVIAR PARA TODAS AS PORTAS)
    // -1 - PACOTE IP null
    public int processarPacote(PacoteIP pacoteIP){

        if(pacoteIP != null) {
            for (int i = 0; i < portas.size(); i++) {
                if (pacoteIP.getEnderecoMacDestino().equals(portas.get(i).getEnderecoMac())) {
                    return 0;
                }
            }
        }else {
            return -1;
        }
        return 1;
    }

}
