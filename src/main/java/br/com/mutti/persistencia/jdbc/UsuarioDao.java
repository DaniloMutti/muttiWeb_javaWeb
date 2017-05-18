package br.com.mutti.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mutti.persistencia.entidade.Usuario;

public class UsuarioDao {
    
	private Connection con = ConexaoFactory.getConnection();
	
	
	public void cadastrar(Usuario user) {
		String sql = "insert into usuario (nome_usuario, login_usuario, senha_usuario) values (?,?,?)";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, user.getNome());
			preparador.setString(2, user.getLogin());
			preparador.setString(3, user.getSenha());
			preparador.execute();//executa a query
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void alterar(Usuario user) {
		String sql = "update usuario set nome_usuario = ?, login_usuario = ?, senha_usuario = ? where id_usuario = ?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, user.getNome());
			preparador.setString(2, user.getLogin());
			preparador.setString(3, user.getSenha());
			preparador.setInt(4, user.getId());
			preparador.execute();//executa a query
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void Excluir(Usuario user) {
		String sql = "delete from usuario where id_usuario = ?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			
			preparador.setInt(1, user.getId());
			preparador.execute();//executa a query
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
