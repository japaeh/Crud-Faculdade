package entity;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Sobrescrevendo o método imprimirDetalhes
    @Override
    public void imprimirDetalhes() {
        System.out.println("Pessoa Jurídica: " + getNome() + ", CNPJ: " + cnpj + ", Endereço: " + getEndereco());
    }

	public void add(PessoaJuridica pessoaJuridica) {
		// TODO Auto-generated method stub
		
	}

	


}
