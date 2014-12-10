package controllers;

import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Hello Suworld."));
    }

    public static Result addPerson() {
            Person person = Form.form(Person.class).bindFromRequest().get();
            return redirect(controllers.routes.Application.index());
        }
    }
