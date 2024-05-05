package model.beans;

public class Hotel {
    private int idHotel, quantQuarto;
    private String nome, localizacao, descricao;


    public Hotel(){

    }

    public Hotel(int idHotel, int quantQuarto, String nome, String localizacao, String descricao) {
        this.idHotel = idHotel;
        this.quantQuarto = quantQuarto;
        this.nome = nome;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getQuantQuarto() {
        return quantQuarto;
    }

    public void setQuantQuarto(int quantQuarto) {
        this.quantQuarto = quantQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
