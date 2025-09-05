package model.calculadora;

import model.dto.FazDTO;
import model.dto.SalvaDTO;
import model.factorys.OperacaoFabrica;
import model.operacoes.InterfaceOp;
import model.operacoes.*;
import model.exceptions.OperacaoInvalidaException;

public class Calculadora implements InterfaceCalc{

    @Override
    public SalvaDTO calcular(FazDTO dado){

        OperacaoFabrica fabrica = new OperacaoFabrica();
        InterfaceOp operacao = null;

        try {
            operacao =  fabrica.criar(dado.getOpcao());
        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro: operação inválida.");
        }


        int value1 = dado.getNum1();
        int value2 = dado.getNum2();
        int resultado = 0;

        if (operacao != null){
            resultado = operacao.operar(value1,value2);
        }

        return new SalvaDTO(resultado);
    }
}