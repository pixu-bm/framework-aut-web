package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import utils.ReportUtils;

public class SearchSteps {
    @Given("acessei o site do Google")
    public void acessarGoogle(){
        SearchPage search = new SearchPage();
        search.acessarGoogle();
        ReportUtils.logPrint("Acessando google");
    }

    @When("pesquisar por hello world")
    public void pesquisarHelloWorld(){
        SearchPage search = new SearchPage();
        search.pesquisarHelloWorld();
        ReportUtils.logPrint("Pesquisando por hello world");
    }

    @Then("sera exibido Programa Olá Mundo")
    public void verificarTextoNaTela(){
        SearchPage search = new SearchPage();
        search.verificarTextoNaTela();
        ReportUtils.logPrint("Verificando msg na tela");
    }

    @And("voltara para página inicial do Google")
    public void voltarPaginaInicialGoogle(){
        SearchPage search = new SearchPage();
        search.voltarPaginaInicialGoogle();
        ReportUtils.logPrint("Voltando para tela inicial");
    }
}
