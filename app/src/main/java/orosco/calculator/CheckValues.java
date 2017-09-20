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

    public boolean checkDots (String display){
        display= display.substring(display.length()-1,display.length());
        if (!display.contains(".")){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkBlankSpace(String display){
        display= display.substring(display.length()-1,display.length());
        if (display.contains(" ")){
            return true;
        }else{
            return false;
        }
    }
}
