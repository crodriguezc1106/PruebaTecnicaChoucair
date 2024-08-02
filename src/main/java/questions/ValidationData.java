package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ValidationHome;

public class ValidationData implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ValidationHome.TXT_INFO).answeredBy(actor);
    }

    public static ValidationData validation()
    {
        return new ValidationData();
    }
}
