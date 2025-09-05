package model.factorys;

import model.exceptions.OperacaoInvalidaException;

public interface InterfaceFactory<T> {
    T criar(String opcao) throws OperacaoInvalidaException;
}
