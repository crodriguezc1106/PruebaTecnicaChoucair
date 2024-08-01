package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import task.Login;

public class LoginStepDefinition {

    @Managed
    WebDriver navegador;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(navegador));

    }

    @Dado("el usuario ingresa a la página web")
    public void elUsuarioIngresaALaPáginaWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @Cuando("el usuario ingresa las credenciales")
    public void elUsuarioIngresaLasCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter());
    }

    @Entonces("el usuario se logueo exitosamente")
    public void elUsuarioSeLogueoExitosamente() {
    }
}
