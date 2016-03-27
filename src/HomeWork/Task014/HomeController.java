package ru.kpfu.itis.Group11401.Astashev.Task014;/**
 * Created by 1 on 26.03.2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/home")// к чему мапится
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String hiPage() {

        return "Home";
    }
    @RequestMapping(method = RequestMethod.POST) //при гет запосе будет выполнятся к этому урлу
    public String homePage(ModelMap model,@RequestParam(required = false) String text) {


            Pattern pattern = Pattern.compile("/(mult|add)/([0-9]+)/([0-9]+)");
            Pattern pattern1 = Pattern.compile("/search/((baidu)|(bing)|(yahoo)|(aol)).com");
            Matcher matcher = pattern.matcher(text);
            Matcher matcher1 = pattern1.matcher(text);

        if(text.equals("/getDate")){
            model.put("date", new java.util.Date());
           return "Date";
        }
            if(matcher.find()){

                model.put("first",matcher.group(2));
                model.put("second",matcher.group(3));

                if(matcher.group(1).equals( "mult")){
                    int response =  Integer.parseInt(matcher.group(2)) * Integer.parseInt(matcher.group(2));
                    model.put("response",response);
                    model.put("math", "*");
                } if(matcher.group(1).equals( "sum")){
                    int response =  Integer.parseInt(matcher.group(2)) + Integer.parseInt(matcher.group(2));
                    model.put("response",response);
                    model.put("math", "+");
                }
                return "Math";
            }
            if(matcher1.find()){
                    model.put("search", matcher1.group(1));
                return "Search";
            }

        return "exeption";
    }

}