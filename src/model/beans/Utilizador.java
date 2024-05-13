package model.beans;

import enums.TipoUser;

public class Utilizador {
    private int idUtilizador;
    private TipoUser tipoUser;
    private String username, password;


    public Utilizador(){

    }

    public Utilizador(int idUtilizador, String username, String password,  TipoUser tipoUser) {
        this.idUtilizador = idUtilizador;
        this.tipoUser = tipoUser;
        this.username = username;
        this.password = password;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    public TipoUser getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(TipoUser tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
