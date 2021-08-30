package grayfox1031.demoecspringbootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import grayfox1031.demoecspringbootapi.logic.GenreLogic;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping(value = "/index")
public class TopController {

    @Autowired
    GenreLogic genreLogic;

    @GetMapping(value = "", produces = "application/json")
    public String top(Model model) throws IOException {

        model.addAttribute("genre", genreLogic.getGenre());

        return "index";
    }
}
