package generation.org.blogPessoal.model;

public class UsuarioLogin {

	private String nome;

	private String usuario;

	private String senha;

	// private boolean admin;

	private String token;

	/*
	 * public boolean isAdmin() { return admin; }
	 * 
	 * public void setAdmin(boolean admin) { this.admin = admin; }
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
