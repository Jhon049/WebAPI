package co.com.sofka.util.question;

import co.com.sofka.util.ResponseBody;
import co.com.sofka.util.Tag;
import io.restassured.parsing.Parser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import java.util.Arrays;
import java.util.List;

public class ResponseBodyQuestion implements Question {
    private static  final String HTML = "html";
    private static  final String CSS = "css";
    private static  final String JAVASCRIPT = "javascript";
    int cont = 0;

    @Override
    public Boolean answeredBy(Actor actor) {

        List<ResponseBody> responseFlowList = Arrays.asList(
                LastResponse.received().answeredBy(actor).
                        then().parser("text/html", Parser.JSON).extract().response().as(ResponseBody[].class)
        );

        int cantidadLibros = responseFlowList.size();
        for (ResponseBody book : responseFlowList) {
            boolean cumpleCriterio = false;
            List<Tag> listaTag = book.getTags();
            for (Tag tag : listaTag) {
                if (tag.getNicename().contains(HTML) || tag.getNicename().contains(CSS) || tag.getNicename().contains(JAVASCRIPT)){
                    cumpleCriterio = true;
                    ++cont;
                    break;
                }
            }
        }
        return cont ==cantidadLibros;
    }
    public static ResponseBodyQuestion responseBodyQuestion(){
        return new ResponseBodyQuestion();
    }
}
