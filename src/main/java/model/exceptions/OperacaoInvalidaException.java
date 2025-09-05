package model.exceptions;

public class OperacaoInvalidaException extends Exception{
    public OperacaoInvalidaException(String erro){
        super(erro);
    }
}