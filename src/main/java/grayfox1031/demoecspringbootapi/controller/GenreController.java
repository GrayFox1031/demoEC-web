package grayfox1031.demoecspringbootapi.controller;

import grayfox1031.demoecspringbootapi.logic.GenreLogic;
import grayfox1031.demoecspringbootapi.logic.ItemsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping(value = "/index")
public class GenreController {

        @Autowired
        GenreLogic genreLogic;

        @GetMapping(value = "/genre", produces = "application/json")
        public String genre(Model model) throws IOException {

            model.addAttribute("genre", genreLogic.getGenre());

            return "genre";
        }
}
