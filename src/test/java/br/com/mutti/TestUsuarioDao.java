package br.com.mutti;

import br.com.mutti.persistencia.entidade.Usuario;
import br.com.mutti.persistencia.jdbc.UsuarioDao;

public class TestUsuarioDao {

	public static void main(String[] args) {
		testeExcluir();

	}
	
	public static void testeCadastar(){
		Usuario user = new Usuario("Danilo Mutti", "Mutti", "mutti8107");
		
		UsuarioDao userDao = new UsuarioDao();
		userDao.cadastrar(user);
		
		System.out.println("rolou");
	}
	
	public static void testeAlterar(){
		Usuario user = new Usuario(2, "Danilo Mutti", "Mutti", "mutti81070081");
		
		UsuarioDao userDao = new UsuarioDao();
		userDao.alterar(user);
		
		System.out.println("rolou alterar");
	}
	
	public static void testeExcluir(){
		Usuario user = new Usuario();
		user.setId(2);
		UsuarioDao userDao = new UsuarioDao();
		userDao.Excluir(user);
		
		System.out.println("rolou excluir");
	}

} 
