package controllers;

import play.mvc.*;

import views.html.*;

public class User extends Controller {

    public Result indexUser() {
        return ok(indexUsers.render(models.User.all()));
    }

    public Result createUser() {
        return ok(indexUsers.render(models.User.createUser()));
    }

    public Result showUser() {
        return ok(indexUsers.render(models.User.showUser()));
    }

    public Result deleteUser() {
        return ok(indexUsers.render(models.User.deleteUser()));
    }


}
