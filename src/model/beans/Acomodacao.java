package model.beans;

import enums.TipoQuarto;

public abstract class Acomodacao {
    private int idQuarto, capacidade, idHotel;
    private String descricao;
    private TipoQuarto tipoQuarto;
    private double precoDiario;

    public Acomodacao(){

    }
    public Acomodacao(int idQuarto, int capacidade, int idHotel, String descricao, TipoQuarto tipoQuarto, double precoDiario) {
        this.idQuarto = idQuarto;
        this.capacidade = capacidade;
        this.idHotel = idHotel;
        this.descricao = descricao;
        this.tipoQuarto = tipoQuarto;
        this.precoDiario = precoDiario;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(double precoDiario) {
        this.precoDiario = precoDiario;
    }
}
