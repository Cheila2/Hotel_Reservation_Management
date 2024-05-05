package model.beans;

public class Cliente {
    private int idCliente, telefone;
    private String nome, email, idEndereco, idUtilizador;

   public Cliente(){

   }

    public Cliente(int idCliente, int telefone, String nome, String email, String idEndereco, String idUtilizador) {
        this.idCliente = idCliente;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
        this.idEndereco = idEndereco;
        this.idUtilizador = idUtilizador;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(String idUtilizador) {
        this.idUtilizador = idUtilizador;
    }
}
