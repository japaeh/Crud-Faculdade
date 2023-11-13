package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import entity.PessoaJuridica;

public class PessoaJuridicaRepository {
    private List<PessoaJuridica> pessoaJuridica = new ArrayList<>();

    // Create
    public void adicionarPessoaJuridica(PessoaJuridica pessoaJuridica) {
        pessoaJuridica.add(pessoaJuridica);
    }

    // Read
    public void listarPessoasJuridicas() {
        for (PessoaJuridica pessoaJuridica : pessoaJuridica) {
            pessoaJuridica.imprimirDetalhes();
        }
    }

    // Update
    public void atualizarPessoaJuridica(String cnpj, PessoaJuridica novaPessoaJuridica) {
        Optional<PessoaJuridica> pessoaEncontrada = encontrarPessoaJuridica(cnpj);

        pessoaEncontrada.ifPresent(pessoa -> {
            pessoaJuridica.remove(pessoa);
            pessoaJuridica.add(novaPessoaJuridica);
        });
    }

    // Delete
    public void removerPessoaJuridica(String cnpj) {
        Optional<PessoaJuridica> pessoaEncontrada = encontrarPessoaJuridica(cnpj);

        pessoaEncontrada.ifPresent(pessoa -> pessoaJuridica.remove(pessoa));
    }

    // Auxiliar para encontrar uma pessoa pelo CNPJ
    private Optional<PessoaJuridica> encontrarPessoaJuridica(String cnpj) {
        return pessoaJuridica.stream()
                               .filter(pessoa -> pessoa.getCnpj().equals(cnpj))
                               .findFirst();
    }
}