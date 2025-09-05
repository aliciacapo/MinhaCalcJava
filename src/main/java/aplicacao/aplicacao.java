package aplicacao;

import controler.ControlerCalc;
import model.dto.FazDTO;
import model.dto.SalvaDTO;
import view.Menu;

public class aplicacao {

    public static void main(String[] args){
        Menu menu = new Menu();
        menu.mostrar();


        FazDTO dado = menu.recolhaValor();
        ControlerCalc controlecalc = new ControlerCalc();

        SalvaDTO salvar = null;
        salvar = controlecalc.Calcular(dado);
        menu.mostrarResultado(salvar);

    }
}
