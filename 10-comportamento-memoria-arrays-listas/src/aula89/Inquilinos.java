package aula89;

public class Inquilinos {
	
	private String nome;
	private String email;
	
	public Inquilinos(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public String toString() {
		return this.nome + ", " + this.email; 
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

}
