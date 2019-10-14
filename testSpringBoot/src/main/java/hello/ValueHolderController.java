package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/values")

public class ValueHolderController {


    private int firstValue;
    private int secondValue;


    public int getMultiplication(@RequestParam(value="firstValue") int firstValue,
                            @RequestParam(value="secondValue")  int secondValue)
        {
        return new ValuesHolder(firstValue,
                secondValue).getMultiplication();
    }

}
