package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.PessoaFisica;

public class PessoaFisicaRepository {
    private List<PessoaFisica> pessoaFisica = new ArrayList<>();

    // Create
    public void adicionarPessoaFisica(PessoaFisica pessoaFisica) {
        pessoaFisica.add(pessoaFisica);
    }

    // Read
    public void listarPessoaFisica() {
        for (PessoaFisica pessoaFisica : pessoaFisica) {
            pessoaFisica.imprimirDetalhes();
        }
    }

    // Update
    public void atualizarPessoaFisica(String cpf, PessoaFisica novaPessoaFisica) {
        Optional<PessoaFisica> pessoaEncontrada = encontrarPessoaFisica(cpf);

        pessoaEncontrada.ifPresent(pessoa -> {
            pessoaFisica.remove(pessoa);
            pessoaFisica.add(novaPessoaFisica);
        });
    }

    // Delete
    public void removerPessoaFisica(String cpf) {
        Optional<PessoaFisica> pessoaEncontrada = encontrarPessoaFisica(cpf);

        pessoaEncontrada.ifPresent(pessoa -> pessoaFisica.remove(pessoa));
    }

    // Auxiliar para encontrar uma pessoa pelo CPF
    private Optional<PessoaFisica> encontrarPessoaFisica(String cpf) {
        return pessoaFisica.stream()
                             .filter(pessoa -> pessoa.getCpf().equals(cpf))
                             .findFirst();
    }
}