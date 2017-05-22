package ua.kpi.tef.controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils(view, model, scanner);

        utils.saveNoteWithUniqueNickName();

        View.print(model.getNoteBook().toString());
    }
}
