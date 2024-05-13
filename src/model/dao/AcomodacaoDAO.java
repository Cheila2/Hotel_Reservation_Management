package model.dao;

import model.beans.Acomodacao;
import model.beans.Cliente;
import model.beans.Reservavel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcomodacaoDAO extends Acomodacao implements Reservavel {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public void reservar(Cliente cliente, int dias) {

    }

    @Override
    public void cancelarReserva() {

    }
}
