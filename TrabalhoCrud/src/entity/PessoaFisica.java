package entity;

public class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Sobrescrevendo o método imprimirDetalhes
    @Override
    public void imprimirDetalhes() {
        System.out.println("Pessoa Física: " + getNome() + ", CPF: " + cpf + ", Endereço: " + getEndereco());
    }

	public void add(PessoaFisica pessoaFisica) {
		// TODO Auto-generated method stub
		
	}
}
