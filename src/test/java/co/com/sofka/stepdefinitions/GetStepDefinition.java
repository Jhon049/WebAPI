package co.com.sofka.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;

import net.serenitybdd.screenplay.Actor;
import org.hamcrest.Matchers;

import static co.com.sofka.util.question.ResponseBodyQuestion.responseBodyQuestion;
import static co.com.sofka.util.question.Respuesta.respuesta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetStepDefinition extends ServiceSetUp{
    private static final Logger LOGGER = Logger.getLogger(GetStepDefinition.class);
    Actor Pepito = Actor.named("Pepito Perez");

    @When("realizo una solicitud a un endpoint con parametros definidos")
    public void WhenRealizoUnaSolicitudAUnEndpointConParametrosDefinidos(){
        generalSetUp();
        Pepito.can(CallAnApi.at(BASE_URI));
        Pepito.attemptsTo(
                Get.resource(BASE_PATH)
                        .with(
                                requestSpecification ->requestSpecification.relaxedHTTPSValidation()
                        )
        );
    }

    @Then("se obtiene una respuesta 200 ok")
    public void seObtieneUnaRespuesta200Ok() {
        Pepito.should(
                seeThatResponse("Status Esperado" + HttpStatus.SC_OK,
                        validatableResponse -> validatableResponse.statusCode(HttpStatus.SC_OK))
                ,seeThat("Respuesta esperada no nula: ", respuesta(), Matchers.notNullValue())
        );
        Pepito.should(
                seeThat("Elementos esperados: ", responseBodyQuestion(), Matchers.is(true))
        );
    }
}
