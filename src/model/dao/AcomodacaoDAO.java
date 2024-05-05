package model.dao;

import model.beans.Acomodacao;
import model.beans.Cliente;
import model.beans.Reservavel;

public class AcomodacaoDAO extends Acomodacao implements Reservavel {

    @Override
    public void reservar(Cliente cliente, int dias) {

    }

    @Override
    public void cancelarReserva() {

    }
}
