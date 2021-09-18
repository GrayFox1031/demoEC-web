package grayfox1031.demoecspringbootapi.controller;

import grayfox1031.demoecspringbootapi.Dto.GenreDto;
import grayfox1031.demoecspringbootapi.logic.GenreLogic;
import grayfox1031.demoecspringbootapi.logic.ItemsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import grayfox1031.demoecspringbootapi.Dto.ItemsDto;
import org.springframework.ui.Model;

import java.io.IOException;

@Controller
@RequestMapping(value = "/index")
public class ItemsController {

    @Autowired
    ItemsLogic itemsLogic;

    // Test display on browser
    @GetMapping(value = "/items", produces = "application/json")
    public String getItems(Model model)  throws IOException {

        model.addAttribute("items", itemsLogic.getItemList());

        System.out.println("Test.image：" + itemsLogic.getItemList().getItems().get(1).getItem().getMediumImageUrls().get(0).getImageUrl());

        return "items";
    }


}
