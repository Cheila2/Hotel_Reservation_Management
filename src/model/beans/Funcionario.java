package model.beans;

public class Funcionario {
    private  int idFuncionario, telefone, idUtilizador;
    private String nome, email;
    private double salario;

    public Funcionario(){

    }
    public Funcionario(int idFuncionario, int telefone, int idUtilizador, String nome, String email, double salario) {
        this.idFuncionario = idFuncionario;
        this.telefone = telefone;
        this.idUtilizador = idUtilizador;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
