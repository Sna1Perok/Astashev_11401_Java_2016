package Controllers; /**
 * Created by 1 on 10.04.2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")// к чему мапится
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String hiPage(ModelMap model) {
        //  model.put("time", new java.util.Date());
        //  model.put("name", name);
        return "login";
    }


}