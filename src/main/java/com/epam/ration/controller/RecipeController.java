package com.epam.ration.controller;

import com.epam.ration.dto.ProductDto;
import com.epam.ration.dto.RecipeDto;
import com.epam.ration.response.ServiceResponse;
import com.epam.ration.response.Status;
import com.epam.ration.service.IProductService;
import com.epam.ration.service.IRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    @Qualifier("recipeServiceImpl")
    private IRecipeService recipeService;

    @Autowired
    @Qualifier("productServiceImpl")
    private IProductService productService;

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public ModelAndView recipes() {
        ServiceResponse<List<RecipeDto>> response = recipeService.find();
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("recipes", "recipesDto", response.getBody());
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/recipe/{recipeId}", method = RequestMethod.GET)
    public ModelAndView recipe(@PathVariable long recipeId) {
        ServiceResponse<RecipeDto> response = recipeService.find(recipeId);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("recipe", "recipeDto", response.getBody());
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public ModelAndView createRecipe(@ModelAttribute("recipeDto") RecipeDto recipeDto) {
        ServiceResponse<List<ProductDto>> response = productService.find();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("productsDto", response.getBody());
        modelAndView.addObject("products", new ProductDto());
        modelAndView.setViewName("admin/create-recipe");
        return modelAndView;
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public ModelAndView createRecipe(@ModelAttribute("recipeDto") @Valid RecipeDto recipeDto,
                                     BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("admin/create-recipe");
        }
        ServiceResponse<Void> response = recipeService.add(recipeDto);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("redirect:/recipe/recipes");
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/update/{recipeId}", method = RequestMethod.GET)
    public ModelAndView updateRecipe(@PathVariable long recipeId) {
        ServiceResponse<RecipeDto> response = recipeService.find(recipeId);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("admin/update-recipe", "recipeDto", response.getBody());
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView updateRecipe(@ModelAttribute("recipeDto") @Valid RecipeDto recipeDto,
                                     BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("admin/update-recipe");
        }
        ServiceResponse<RecipeDto> response = recipeService.update(recipeDto);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("redirect;/recipe/recipes");
        }

        return new ModelAndView("home");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteRecipe(@PathVariable("id") long recipeId) {
        ServiceResponse<Void> response = recipeService.delete(recipeId);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("redirect:/recipe/recipes");
        }
        return new ModelAndView("home");
    }

}
