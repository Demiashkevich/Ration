package com.epam.ration.service.impl;

import com.epam.ration.converter.IRecipeConverter;
import com.epam.ration.dao.RecipeRepository;
import com.epam.ration.dto.RecipeDto;
import com.epam.ration.entity.Recipe;
import com.epam.ration.response.ServiceResponse;
import com.epam.ration.response.Status;
import com.epam.ration.service.IRecipeService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeServiceImpl implements IRecipeService {

    private IRecipeConverter mapping = Mappers.getMapper(IRecipeConverter.class);

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public ServiceResponse<List<RecipeDto>> find() {
        List<Recipe> recipes = recipeRepository.findAll();
        if (recipes == null) {
            return new ServiceResponse<>(Status.FAILED);
        }
        List<RecipeDto> recipesDto = recipes.stream().map(mapping::recipeToRecipeDto).collect(Collectors.toList());
        if (recipesDto != null) {
            return new ServiceResponse<>(recipesDto, Status.SUCCESS);
        }
        return new ServiceResponse<>(Status.FAILED);
    }

    @Override
    public ServiceResponse<RecipeDto> find(long PRODUCT_ID) {
        Recipe recipe = recipeRepository.findOne(PRODUCT_ID);
        if (recipe == null) {
            return new ServiceResponse<>(Status.FAILED);
        }
        RecipeDto recipeDto = mapping.recipeToRecipeDto(recipe);
        if (recipeDto != null) {
            return new ServiceResponse<>(recipeDto, Status.SUCCESS);
        }
        return new ServiceResponse<>(Status.FAILED);
    }

    @Override
    public ServiceResponse<Void> add(RecipeDto recipeDto) {
        if (this.isRecipeExists(recipeDto.getName())) {
            return new ServiceResponse<>(Status.FAILED_UNIQUE, "There is a recipe with that name:" + recipeDto.getName());
        }
        Recipe recipe = mapping.recipeToRecipeDto(recipeDto);
        Recipe save = recipeRepository.save(recipe);
        if (save != null) {
            return new ServiceResponse<>(Status.SUCCESS);
        }
        return new ServiceResponse<>(Status.FAILED);

    }

    @Override
    public ServiceResponse<Void> delete(long RECIPE_ID) {
        recipeRepository.delete(RECIPE_ID);
        return new ServiceResponse<>(Status.SUCCESS);
    }

    @Override
    public ServiceResponse<RecipeDto> update(RecipeDto recipeDto) {
        Recipe recipe = recipeRepository.save(mapping.recipeToRecipeDto(recipeDto));
        if (recipe != null) {
            recipeDto = mapping.recipeToRecipeDto(recipe);
            return new ServiceResponse<>(recipeDto, Status.SUCCESS);
        }
        return new ServiceResponse<>(Status.FAILED);
    }

    private boolean isRecipeExists(final String NAME) {
        Recipe recipe = recipeRepository.findRecipeByName(NAME);
        if (recipe != null) {
            return true;
        }
        return false;
    }

}
