package model.factorys;

import model.calculadora.InterfaceCalc;
import model.exceptions.OperacaoInvalidaException;
import java.lang.reflect.InvocationTargetException;

public class AbstractFactory<T> implements InterfaceFactory<T>{

    protected String pacoteBase = "model.";

    @Override
    public T criar (String opcao) throws OperacaoInvalidaException{
        try {
            String pacoteBase = this.pacoteBase + opcao;

            Class<?> classeOperacao = Class.forName(pacoteBase);
            T t = (T) classeOperacao.getDeclaredConstructor().newInstance();
            return t;
        }

        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
               InvocationTargetException e) {
            throw new OperacaoInvalidaException("Erro ao criar instância da operação: " + e.getMessage());
        }
    }
}
