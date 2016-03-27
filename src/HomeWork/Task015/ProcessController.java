package ru.kpfu.itis.Group11401.Astashev.Task015;/**
 * Created by 1 on 27.03.2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/process")
public class ProcessController {

    @RequestMapping(method = RequestMethod.GET)
    public String hiPage() {

        return "process";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String homePage(ModelMap model, @RequestParam(required = false) String text,
                           @RequestParam(required = false) String option) {


        String req = text;
        if (option.equals("Simvol")) {
            model.put("result", req.length());
        } else if (option.equals("words")) {
            String[] str = req.split(" ");
            model.put("result", str.length);

        } else if (option.equals("sentences")) {
            int str = 0;
            for (int i = 0; i < req.length(); i++) {
                if (req.charAt(i) == '.' || req.charAt(i) == '!' || req.charAt(i) == '?') {
                    str++;
                }
            }
            model.put("result", str);
        } else {
            String[] str = req.split("/n");
            model.put("result", str.length + 1);
        }
        model.put("operation", option);

        return "result";
    }

}