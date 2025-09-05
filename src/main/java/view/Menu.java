package view;

import java.util.Scanner;
import java.util.Set;
import model.dto.FazDTO;
import model.dto.SalvaDTO;
import model.operacoes.*;
import org.reflections.Reflections;

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


        System.out.println("Escolha uma das opção:");
        Reflections reflections = new Reflections("model.operacoes");

        Set<Class<? extends InterfaceOp>> todasClasses = reflections.getSubTypesOf(InterfaceOp.class);

        for (Class<? extends InterfaceOp> passagemClasses : todasClasses) {
            System.out.println(passagemClasses.getSimpleName());
        }
    }

    public void mostrarResultado(SalvaDTO dto){
        System.out.println("Resultado:" + dto.getResultado());
    }

}
