package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class CadastroCliente {
    void cadastrar(String nome, int idade) throws
            DadosInvalidosException {
        if (nome == null || nome.isEmpty() || idade < 18) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("src/main/java/org/example/log_erros.txt", true))) {
                writer.println("Nome não pode ser vazio e idade deve ser maior que 18.");
            } catch (IOException ex) {
                System.out.println("Erro ao abrir arquivo..." + ex.getMessage());
            }
            throw new DadosInvalidosException("Nome não pode ser vazio e idade deve ser maior que 18.");
        }
        System.out.println("Cliente cadastrado com sucesso!");
    }
}