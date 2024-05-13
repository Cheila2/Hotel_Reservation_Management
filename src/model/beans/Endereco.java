package model.beans;

public class Endereco {
    private int idEndereco;
    private String rua;
    private int numeroCasa;

    public Endereco(){

    }

    public Endereco(int idEndereco, String rua, int numeroCasa) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
}
