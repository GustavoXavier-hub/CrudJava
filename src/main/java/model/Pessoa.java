package model;



	import java.util.ArrayList;
	import java.util.List;
	import java.util.Objects;


	public class Pessoa {

		private static List<Pessoa> pessoas = new ArrayList<>();

	    public static void setPessoa(List<Pessoa> p) {
	        Pessoa.pessoas = p;
	    }

	    public static List<Pessoa> getPessoa() {
	        return new ArrayList<>() {
	            {
	                addAll(Pessoa.pessoas);
	            }
	        };
	    }

	    private final String cpf;
	    private final String nome;
	    private final String email;

	    public String getCPF() {
	        return cpf;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public Pessoa comEmail(String email) {
	        return new Pessoa(this.cpf, this.nome, email);
	    }

	    public Pessoa comNome(String nome) {
	        return new Pessoa(this.cpf, nome, this.email);
	    }

	    public Pessoa(String cpf, String nome, String email) {
	        this.cpf = cpf;
	        this.nome = nome;
	        this.email = email;
	    }

	    @Override
	    public String toString() {
	        return pessoas.indexOf(this)+" - CPF: " + cpf + " - " + nome + " - " + email;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof Pessoa){
	            return this.cpf.equals(((Pessoa)obj).getCPF());
	        }
	        return false;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 5;
	        hash = 89 * hash + Objects.hashCode(this.cpf);
	        return hash;
	    }



	}
	    
	    

	
	
	


