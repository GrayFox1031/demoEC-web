package grayfox1031.demoecspringbootapi.controller;

import grayfox1031.demoecspringbootapi.logic.GenreLogic;
import grayfox1031.demoecspringbootapi.logic.ItemsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.io.IOException;

@Controller
@RequestMapping(value = "/index")
public class ItemsController {

    @Autowired
    ItemsLogic itemsLogic;

    @Autowired
    GenreLogic genreLogic;

    @GetMapping(value = "/items", produces = "application/json")
    public String getItems(Model model)  throws IOException {

        model.addAttribute("genre", genreLogic.getGenre());
        model.addAttribute("items", itemsLogic.getItemList());

        return "items";
    }

    @GetMapping(value = "/itemDetail_id", produces = "application/json")
    public String getItemDetail(Model model)  throws IOException {

        model.addAttribute("genre", genreLogic.getGenre());
//        model.addAttribute("items", itemsLogic.getItemList());

        return "itemDetail";
    }
}
