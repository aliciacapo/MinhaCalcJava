package controler;

import model.dto.SalvaDTO;
import model.dto.FazDTO;
import model.calculadora.InterfaceCalc;
import model.calculadora.Calculadora;

public class ControlerCalc {
    public SalvaDTO Calcular(FazDTO dto){
        InterfaceCalc calculadora = new Calculadora();

        return calculadora.calcular(dto);
    }
}
