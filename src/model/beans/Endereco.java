package model.beans;

public class Endereco {
    private int idEndereco;
    private String rua;
    private int nCasa;

    public Endereco(){

    }

    public Endereco(int idEndereco, String rua, int nCasa) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.nCasa = nCasa;
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

    public int getnCasa() {
        return nCasa;
    }

    public void setnCasa(int nCasa) {
        this.nCasa = nCasa;
    }
}
