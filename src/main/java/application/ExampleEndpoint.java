package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleEndpoint {

    @RequestMapping("/starter/hello")
    public String example() {
        return "Hello World...2,,,3...4...555..6..7..8";
    }
}

