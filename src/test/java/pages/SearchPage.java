package pages;

import elements.SearchElements;
import org.openqa.selenium.support.PageFactory;
import steps.TestRule;

public class SearchPage extends SearchElements {

    public SearchPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessarGoogle(){
        System.out.println("a");
    }

    public void pesquisarHelloWorld(){
        campoPesquisar.sendKeys("Hello World");
        botaoPesquisar.submit();
    }

    public void verificarTextoNaTela(){
//        String textoResultado = textoResultadoPesquisa.getText();
    }

    public void voltarPaginaInicialGoogle(){
        TestRule.getDriver().navigate().back();
    }
}
