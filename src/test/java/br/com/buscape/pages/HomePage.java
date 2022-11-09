package br.com.buscape.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private static final By campoBuscape = new By.ByCssSelector("[placeholder=\"Digite sua busca...\"]");
    private static final By limpartexto = new By.ByCssSelector("[placeholder=\"Digite sua busca...\"]");
    private static final By botaoPesquisar = new By.ByCssSelector("[class=\"AutoCompleteStyle_submitButton__2Zijr\"]");
    private static final By validarPagina = new By.ByCssSelector("[class=\"Text_Text__bOTfK Text_MobileHeadingXs_" +
            "_KvPCw Text_DesktopHeadingSAtLarge__mI4JE\"]");
    private static final By pesquisarCep = new By.ByCssSelector("[class=\"Text_Text__VJDNU Text_LabelXsRegular__" +
            "2_1Mh AddressRegion_CepRegionLabelLocation__WnmkB\"]");
    private static final By digitarCep = new By.ByCssSelector("[placeholder=\"Digite seu CEP\"]");
    private static final By clicarBotao = new By.ByCssSelector("[class=\"Button_button__cW0_w Button_system__o30ON" +
            " Button_outline__2biD1\"]");


    public void setEscreverNoCampoBuscape(String pesquisar){sendKeys(campoBuscape, pesquisar);}
    public void setLimpar(){limparCampo(limpartexto);}
    public void setBotaoPesquisar(){ click(botaoPesquisar);}
    public String getvalidar(){ return lerText(validarPagina);}
    public void setAcharCep(){ click(pesquisarCep);}
    public void setDigitarCep(String cep){ sendKeys(digitarCep, cep);}
    public void setClicarBotao(){ click(clicarBotao);}




}
