package model.dao;

import model.beans.Utilizador;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connection.Conexao;

public class UtilizadorDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    //--------------------------------------------------------------------
    public boolean criarUser(Utilizador user){
       // con = new Conexao();
        String sql= "INSERT INTO utilizador (username, password,tipoUser) VALUES (?,?,?)";

        try{
            con = Conexao.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3,user.getTipoUser().toString());
            ps.executeUpdate();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally {
            Conexao.closeConnection(con);
        }
        return true;
    }

    //--------------------------------------------------------------------
    public Utilizador login(String username, String password){

        String sql= "SELECT * FROM utilizador WHERE username=? and password=?";

    }
}

