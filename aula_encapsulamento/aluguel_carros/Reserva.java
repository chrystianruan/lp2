import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private Carro carro;
    private Cliente cliente;

    public Reserva(Carro carro, Cliente cliente) {
        this.carro = carro;
        this.cliente = cliente;
    }

    public Reserva() {

    }

    public void reservar(Carro carro, Cliente cliente) throws Exception {
        if (carro.isReservado()) {
            throw new Exception("Carro já está reservado");
        }
        this.setCarro(carro);
        this.setCliente(cliente);
        carro.setReservado(true);
    }

    public Carro getCarro() {
        return carro;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
