package model.beans;

public interface Reservavel {
    public void reservar(Cliente cliente, int dias);
    public void cancelarReserva();
}
