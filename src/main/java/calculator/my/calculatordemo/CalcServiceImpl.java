package calculator.my.calculatordemo;


import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String sayHello () {
        return "Добро пожаловать в калькулятор";
    }

    public String sum (String num1, String num2) {
        return String.valueOf((Integer.parseInt(num1) + Integer.parseInt(num2)));
    }

    public String sub (String num1, String num2) {
        return String.valueOf((Integer.parseInt(num1) - Integer.parseInt(num2)));
    }

    public String mult (String num1, String num2) {
        return String.valueOf((Integer.parseInt(num1) * Integer.parseInt(num2)));
    }

    public String div ( String num1,  String num2) {
        return String.valueOf((Integer.parseInt(num1) / Integer.parseInt(num2)));
    }
}
