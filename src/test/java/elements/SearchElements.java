package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchElements {
    @FindBy(name = "q")
    protected WebElement campoPesquisar;
    @FindBy(name = "btnK")
    protected WebElement botaoPesquisar;

//    @FindBy(css = "qrShPb kno-ecr-pt PZPZlf q8U8x")
//    protected WebElement textoResultadoPesquisa;
}
