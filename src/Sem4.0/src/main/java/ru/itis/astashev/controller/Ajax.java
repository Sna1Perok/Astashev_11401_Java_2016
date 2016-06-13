package ru.itis.astashev.controller;/**
 * Created by 1 on 30.05.2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Random;

@Controller
public class Ajax {
    @RequestMapping(value = "/ajax")
    public String ajaxTest(Model model) {
        model.addAttribute("ajax", "Static string");
        return "ajax_test";
    }

    @RequestMapping(value = "/ajaxtest", method = RequestMethod.POST)
    public
    @ResponseBody
    String getQuery() {
        System.out.println("JQuery");
        return "Dynamic query" + new Random().nextInt();
    }


    @RequestMapping(value = "/ajax/approve", method = RequestMethod.POST)
    public @ResponseBody void approve(){
        System.out.println("Approved");
    }

    @RequestMapping(value = "/ajax/getParam", method = RequestMethod.POST)
    public @ResponseBody String getParam(@RequestBody ObjectMapper id) throws IOException {
        String resp=id.readValue("fromFTL", String.class);
        String resp2=id.readValue("param", String.class);
        System.out.println(resp+resp2);
        return resp+resp2;
    }
}
