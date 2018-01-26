package somepackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lubos Pecho on 26.1.2018.
 */
@SpringBootApplication
@Controller
public class Application {
    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
