package view;

import java.util.Scanner;
import model.dto.FazDTO;
import model.dto.SalvaDTO;

public class Menu {

    public FazDTO recolhaValor(){

        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.nextLine();
        System.out.println("EScolha o primeiro numero:");
        int num1 = scanner.nextInt();
        System.out.println("EScolha o segundo numero:");
        int num2 = scanner.nextInt();

        return new FazDTO(opcao,num1,num2);
    }

    public void mostrar(){

        System.out.println("1.Adição");
        System.out.println("2.Subtração");
        System.out.println("3.Divisão");
        System.out.println("4.Multiplicação");

    }

    public void mostrarResultado(SalvaDTO dto){
        System.out.println("Resultado:" + dto.getResultado());
    }

}
