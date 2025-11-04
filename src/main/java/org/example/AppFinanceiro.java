package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppFinanceiro {static double calcularDivisao(double a, double b) {
    try {
        return a / b;
    } catch (ArithmeticException e) {
        try(PrintWriter writer = new PrintWriter(new FileWriter("log_erros.txt"))){
            writer.print("Erro: Divisão por zero não é permitida.");
        }catch (IOException ex){
            System.out.println("Erro ao abrir arquivo..." + ex.getMessage());
        }
        System.out.println("Erro: Divisão por zero não é permitida.");
        return 0;
    } finally {
        System.out.println("Operação finalizada com sucesso.");
    }
}


}
