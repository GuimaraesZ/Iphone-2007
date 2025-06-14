package Account.controller;

import Account.exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = sc.nextInt();
            
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = sc.nextInt();
            
            contar(parametroUm, parametroDois);
            
        } catch (Exception e) {
            System.out.println("Erro ao ler os dados: " + e.getMessage());
        } 
        sc.close();
    }
    
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(
                "O primeiro parâmetro (" + parametroUm + 
                ") não pode ser maior que o segundo parâmetro (" + parametroDois + ")"
            );
        }
          
        int contagem = parametroDois - parametroUm;
        System.out.println("Contando de 1 até " + contagem + ":");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
