package com.epam.ration.service;

import com.epam.ration.dto.RecipeDto;
import com.epam.ration.response.ServiceResponse;

import java.util.List;

public interface IRecipeService {

    public ServiceResponse<List<RecipeDto>> find();
    public ServiceResponse<RecipeDto> find(final long RECIPE_ID);
    public ServiceResponse<Void> add(RecipeDto recipeDto);
    public ServiceResponse<Void> delete(final long RECIPE_ID);
    public ServiceResponse<RecipeDto> update(RecipeDto recipeDto);

}
