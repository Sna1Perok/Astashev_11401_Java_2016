package ru.kpfu.itis.Group11401.Astashev.Task014;/**
 * Created by 1 on 26.03.2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dateNow")// к чему мапится
public class DateController {

    @RequestMapping(method = RequestMethod.GET) //при гет запосе будет выполнятся к этому урлу
    public String hiPage(ModelMap model) {
        model.put("date", new java.util.Date());
        return "Date";
    }


}