package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginPage;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Iniciar sesión
        actor.attemptsTo(Enter.theValue("Admin").into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("admin123").into(LoginPage.TXT_PASSWORD));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //navegar a Recruitment

        actor.attemptsTo(Click.on(LoginPage.BTN_RECRUITMENT));
        actor.attemptsTo(Click.on(LoginPage.BTN_ADD));

    }




    public static Login enter()
    {
        return Tasks.instrumented(Login.class);
    }


}
