import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {

    static VelocityTemplateEngine template = new VelocityTemplateEngine();

    public static void main(String[] args) {

        String layout = "templates/layout.vm";

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/form.vm");

            return template.render(
                new ModelAndView(model, layout)
            );
        });
    }
}
