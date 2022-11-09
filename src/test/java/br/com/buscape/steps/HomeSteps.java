package br.com.buscape.steps;

import br.com.buscape.pages.HomePage;
import org.junit.Test;

public class HomeSteps extends BaseSteps{

    //instâncias
    HomePage homePage = new HomePage();

    @Test
    public void pesquisarUmNomeExistenteNoCampoBuscape(){

        homePage.setEscreverNoCampoBuscape("IPHONE");
        homePage.setLimpar();
        homePage.setEscreverNoCampoBuscape("Iphone13");
        homePage.setBotaoPesquisar();
        homePage.getvalidar();
        homePage.setAcharCep();
        homePage.setDigitarCep("69088150");
        homePage.setClicarBotao();
    }

}
