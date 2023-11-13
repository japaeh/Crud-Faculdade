package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.Pessoa;

public class PessoaRepository {
    private List<Pessoa> pessoa = new ArrayList<>();

    // Create
    public void adicionarPessoa(Pessoa pessoa) {
        pessoa.add(pessoa);
    }

    // Read
    public void listarPessoa() {
        for (Pessoa pessoa : pessoa) {
            pessoa.imprimirDetalhes();
        }
    }

    // Update
    public void atualizarPessoa(String nome, Pessoa novaPessoa) {
        Optional<Pessoa> pessoaEncontrada = encontrarPessoa(nome);

        pessoaEncontrada.ifPresent(pessoa -> {
            pessoa.remove(pessoa);
            pessoa.add(novaPessoa);
        });
    }

    // Delete
    public void removerPessoa(String nome) {
        Optional<Pessoa> pessoaEncontrada = encontrarPessoa(nome);

        pessoaEncontrada.ifPresent(pessoa -> pessoa.remove(pessoa));
    }

    // Auxiliar para encontrar uma pessoa pelo nome
    private Optional<Pessoa> encontrarPessoa(String nome) {
        return pessoa.stream()
                      .filter(pessoa -> pessoa.getNome().equals(nome))
                      .findFirst();
    }
}
