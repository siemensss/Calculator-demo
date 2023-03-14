package calculator.my.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/calculator")
@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }
    @GetMapping
    public String sayHello () {
        return calcService.sayHello();
    }
    @GetMapping(path = "/plus")
    public String sum (@RequestParam(value = "num1",required = false) String num1, @RequestParam (value = "num2",required = false) String num2) {
        return calcService.sum(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String sub (@RequestParam(value = "num1",required = false) String num1, @RequestParam (value = "num2",required = false) String num2) {
        return calcService.sub(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String mult (@RequestParam(value = "num1", required = false) String num1, @RequestParam (value = "num2",required = false) String num2) {
        return calcService.mult(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String div (@RequestParam(value = "num1",required = false) String num1, @RequestParam (value = "num2",required = false) String num2) {
        return calcService.div(num1, num2);
    }
}
