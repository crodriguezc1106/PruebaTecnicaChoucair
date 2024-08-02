package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ValidationHome {

    public static final Target TXT_INFO = Target.the("validar pagina")
            .locatedBy("//*[text()='Time at Work']");
}