package userinterface;

import net.serenitybdd.screenplay.targets.Target;


public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("sirve para ingresar usuario")
            .locatedBy("//input[@name='username']");


    public static final Target TXT_PASSWORD = Target.the("sirve para ingresar clave")
            .locatedBy("//input[@name='password']");

    public static final Target BTN_LOGIN = Target.the("clic en el botón login")
            .locatedBy("//button[@type='submit']");
}





