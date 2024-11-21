package engtelecom.poo;

public class Rota {
    private int id;
    private int portaAssociada;

    public Rota(int id, int portaAssociada) {
        this.id = id;
        this.portaAssociada = portaAssociada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPortaAssociada() {
        return portaAssociada;
    }

    public void setPortaAssociada(int portaAssociada) {
        this.portaAssociada = portaAssociada;
    }
}
