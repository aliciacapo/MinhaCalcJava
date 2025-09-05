package model.dto;

public class FazDTO {

    String opcao = "";
    int num1 = 0;
    int num2 = 0;

    public FazDTO(String opcao, int num1, int num2) {

        this.opcao = opcao;
        this.num1 = num1;
        this.num2 = num2;

    }

    public String getOpcao(){
        return opcao;
    }

    public void setOpcao(String dado){
        this.opcao = dado;
    }

    public int getNum1(){
        return num1;
    }

    public void setNum1(int valor){
        this.num1 = valor;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int valor){
        this.num2 = valor;
    }

}
