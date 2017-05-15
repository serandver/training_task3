package ua.kpi.tef.controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser()  {
        //TODO
    }
}
