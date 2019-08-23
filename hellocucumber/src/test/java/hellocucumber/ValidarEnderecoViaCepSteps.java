package hellocucumber;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import static com.jayway.restassured.RestAssured.given;

public class ValidarEnderecoViaCepSteps {

    RequestSpecification request;
    Response response;
    String url = "https://viacep.com.br/ws/";

    @Dado("que acessei a api ViaCep")
    public void queAcesseiAApiViaCep() {
        request = given();
    }

    @Quando("informei o cep {string}")
    public void informeiOCep(String cep) {
        response = request.when().get(url + cep + "/json");
    }

    @Então("deverá mostrar o nome da rua {string}")
    public void deveraMostrarONomeDaRua(String rua) {
        String ruaEsperada = response.then().extract().jsonPath().get("logradouro");
        Assert.assertEquals(rua, ruaEsperada);
    }

    @Então("deverá mostrar o nome do bairro {string}")
    public void deveraMostrarONomeDoBairro(String bairro) {
        String bairroEsperada = response.then().extract().jsonPath().get("bairro");
        Assert.assertEquals(bairro, bairroEsperada);
    }

    @Então("deverá mostrar o nome do cidade{string}")
    public void deveraMostrarONomeDoCidade(String localidade) {
        String localidadeEsperada = response.then().extract().jsonPath().get("localidade");
        Assert.assertEquals(localidade, localidadeEsperada);
    }
}
