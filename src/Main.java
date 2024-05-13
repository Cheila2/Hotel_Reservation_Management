import enums.TipoUser;
import model.beans.Utilizador;
import model.dao.UtilizadorDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t\t\t=================================================");
        System.out.println("\t\t\t\t\t          B E M - V I N D O");
        System.out.println("\t\t\t=================================================");
        Scanner x = new Scanner(System.in);

        System.out.println("Username: ");
        String usern= x.nextLine();

      Utilizador utilizador= new Utilizador();
      utilizador.setUsername(usern);
      utilizador.setPassword("1234");
      utilizador.setTipoUser(TipoUser.valueOf("cliente"));

      UtilizadorDAO utilizadorDAO = new UtilizadorDAO();
      boolean result = utilizadorDAO.criarUser(utilizador);

      if(result==true)System.out.println("Criado");
      else System.out.println("User nao criado!");
    }
}