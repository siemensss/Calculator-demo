package calculator.my.calculatordemo;


import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String sayHello () {
        return "Добро пожаловать в калькулятор";
    }

    public int sum (String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public int sub (String num1, String num2) {
        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }

    public int mult (String num1, String num2) {
        return Integer.parseInt(num1) * Integer.parseInt(num2);
    }

    public int div ( String num1,  String num2) {
        return Integer.parseInt(num1) / Integer.parseInt(num2);
    }
}
