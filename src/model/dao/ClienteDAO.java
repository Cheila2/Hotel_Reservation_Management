package model.dao;

import model.beans.Cliente;
import model.beans.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ClienteDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


//    public boolean registarCliente(Cliente cliente){
//        String sql= "INSERT INTO cliente (nome, email, telefone,idEndereco,idUtilizador) VALUES (?,?,?,?,?)";
//    }
//
//    public List<Cliente> listarCliente(){
//
//    }
//
//    public boolean eliminarCliente(int id){
//
//    }
//
//    public boolean atualizarCliente(int id, Cliente cliente, Endereco endereco, Utilizador user){
//
//    }
}
