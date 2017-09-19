package orosco.calculator;

import org.w3c.dom.Text;

/**
 * Created by orosco on 18/09/17.
 */

public class CheckValues {

    public String checkValues (String number, String button){
        if (number.length()==1 & number.contains("0")){
            return button;
        }else {
            number+=button;
            return number;

        }
    }
}
