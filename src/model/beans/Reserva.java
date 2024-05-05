package model.beans;

import java.util.Date;

public class Reserva {
    private int idReserva, idQuarto, idCliente,idHotel;
    private Date checkin, checkout;
    private double valorTotal;

    public Reserva(){

    }

    public Reserva(int idReserva, int idQuarto, int idCliente, int idHotel, Date checkin, Date checkout, double valorTotal) {
        this.idReserva = idReserva;
        this.idQuarto = idQuarto;
        this.idCliente = idCliente;
        this.idHotel = idHotel;
        this.checkin = checkin;
        this.checkout = checkout;
        this.valorTotal = valorTotal;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
