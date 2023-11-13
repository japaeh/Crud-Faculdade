package entity;

public abstract class Pessoa {
    private String nome;
    private String endereco;

    // Construtor
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método abstrato
    public abstract void imprimirDetalhes();

	public void add(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	
	
}
