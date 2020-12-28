package com.dams.controllers;

import com.dams.domain.Category;
import com.dams.domain.UnitOfMeasure;
import com.dams.repositories.CategoryRepository;
import com.dams.repositories.UnitOfMeasureRepository;
import com.dams.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
