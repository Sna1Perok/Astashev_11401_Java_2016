import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletContext;

/**
 * Created by 1 on 07.10.2015.
 */


public class ConfigSinglTom {
public static Configuration  cfg = null;
    public static  Configuration getConfig(ServletContext sc){
        if (cfg == null){
            cfg = new Configuration(Configuration.VERSION_2_3_22);
            cfg.setServletContextForTemplateLoading(sc,"/WEB-INF/Template");
        }
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        return cfg;
    }
}