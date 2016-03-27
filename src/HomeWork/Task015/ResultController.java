package ru.kpfu.itis.Group11401.Astashev.Task015;/**
 * Created by 1 on 27.03.2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/result")// к чему мапится
public class ResultController {

    @RequestMapping(method = RequestMethod.POST)
    public String hiPage(ModelMap model, @RequestParam(required = false) String text,
                         @RequestParam(required = false) String operation) {

        if (text != null) {
            model.put("operation", operation);
            model.put("result",text);
        }
        else {
            return "process";
        }
        return "result";

    }


}