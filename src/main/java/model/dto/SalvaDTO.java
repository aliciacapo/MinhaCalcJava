package model.dto;

public class SalvaDTO {

    int resultado = 0;

    public SalvaDTO(int resultado){
        this.resultado = resultado;
    }

    public int getResultado(){
        return resultado;
    }

    public void setResultado(int resultado){
        this.resultado = resultado;
    }
}
