package model.factorys;

import model.operacoes.InterfaceOp;

public class OperacaoFabrica extends AbstractFactory<InterfaceOp>{

    public OperacaoFabrica(){
        super.pacoteBase = super.pacoteBase+"operacoes.";
    }
}
