package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ma on 09.03.2016.
 */
@Controller
@RequestMapping("/hi")// к чему мапится
public class HelloController {

    @RequestMapping(method = RequestMethod.GET) //при гет запосе будет выполнятся к этому урлу
    public String hiPage(ModelMap model, @RequestParam(required = false) String name) {
        model.put("time", new java.util.Date());

        model.put("name", name);
        return "hi";
    }

}