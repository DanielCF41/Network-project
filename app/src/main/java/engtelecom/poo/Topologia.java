package engtelecom.poo;

// CLASSE QUE REPRESENTA A TOPOLOGIA DA APLICAÇÃO

import engtelecom.poo.dispositivos.Computador;
import engtelecom.poo.dispositivos.Comutador;
import engtelecom.poo.dispositivos.Firewall;
import engtelecom.poo.dispositivos.Roteador;
import engtelecom.poo.enderecos.Enderecos;

import java.util.ArrayList;

public class Topologia {
    // DISPOSITIVOS DA TOPOLOGIA
    private ArrayList<Dispositivo> dispositivos;

    public Topologia() {
        dispositivos = new ArrayList<>();
        Comutador aux;
        for (Enderecos e : Enderecos.values()) {
            if(e.getEnderecoMac().equals("C1")){
                dispositivos.add(new Comutador(e.getEnderecoMac(), e.getEnderecoIp()));
            } else if (e.getEnderecoMac().equals("C2")) {
                dispositivos.add(new Comutador(e.getEnderecoMac(), e.getEnderecoIp()));
            } else if (e.getEnderecoMac().equals("R1")) {
                dispositivos.add(new Roteador(e.getEnderecoMac(),e.getEnderecoIp()));
            } else if (e.getEnderecoMac().equals("F1")) {
                dispositivos.add(new Firewall(e.getEnderecoMac(), e.getEnderecoIp()));
            }else{
                if(e.getEnderecoMac().charAt(0) == 'A'){
                    aux = (Comutador) dispositivos.get(0);
                    aux.getPortas().add(new Computador(e.getEnderecoMac(), e.getEnderecoIp()));
                }else{
                    aux = (Comutador) dispositivos.get(1);
                    aux.getPortas().add(new Computador(e.getEnderecoMac(), e.getEnderecoIp()));
                }
            }
        }
        aux = (Comutador)  dispositivos.get(0);
        aux.getPortas().add(dispositivos.get(2));
        aux = (Comutador) dispositivos.get(1);
        aux.getPortas().add(dispositivos.get(2));
        for (int i = 0; i < 3; i++) {
            Roteador auxR = (Roteador) dispositivos.get(2);
            if(i < 2) {
                aux = (Comutador) dispositivos.get(i);
                auxR.adicionarRota(i + 1, 5);
            }else{
                auxR.adicionarRota(i + 1, 0);
            }
        }
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

}
