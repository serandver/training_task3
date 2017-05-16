package ua.kpi.tef;

import ua.kpi.tef.controller.Controller;
import ua.kpi.tef.model.Model;
import ua.kpi.tef.model.entity.Group;
import ua.kpi.tef.view.View;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
