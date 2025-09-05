package model.operacoes;

public class Divisao implements InterfaceOp {
    @Override

    public int operar(int num1, int num2){
        return num1 / num2;
    }
}
