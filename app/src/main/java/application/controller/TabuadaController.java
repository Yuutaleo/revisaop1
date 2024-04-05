package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tabuada")
public class TabuadaController{
    @RequestMapping("/form")
    public String form(){
        return "form";

    }

    @RequestMapping("/calcular")
public String calcular(Model ui, @RequestParam("valor") int valor){
    int[] resultado = new int[10];
    for (int num = 1;num <=10; num++ ){
        resultado[num-1] = num * valor; }
    ui.addAtribute("tabuada", resultado);
    return "form";

}

}

