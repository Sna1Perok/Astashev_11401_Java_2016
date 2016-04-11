import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by 1 on 29.12.2015.
 */
@WebServlet(name = "HomeS")
public class MainPageS extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Configuration cfg = ConfigSinglTom.getConfig(getServletContext());
        System.out.printf("");
        Template tmpl = cfg.getTemplate("mainPage.ftl");
        HashMap<String, Object> root = new HashMap<String, Object>();
        try {
            //  root.put("list_news", arrayList);
            tmpl.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }

    }
}
