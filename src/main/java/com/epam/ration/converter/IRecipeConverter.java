package com.epam.ration.converter;

import com.epam.ration.dto.RecipeDto;
import com.epam.ration.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface IRecipeConverter {

    @Mappings({
            @Mapping(target = ("entity.name"), source = ("name")),
            @Mapping(target = ("entity.description"), source = ("description")),
            @Mapping(target = ("entity.rating"), source = ("rating")),
    })
    public Recipe recipeToRecipeDto(RecipeDto recipeDto);

    @Mappings({
            @Mapping(target = ("dto.recipeId"), source = ("recipeId")),
            @Mapping(target = ("dto.name"), source = ("name")),
            @Mapping(target = ("dto.description"), source = ("description")),
            @Mapping(target = ("dto.rating"), source = ("rating"))
    })
    public RecipeDto recipeToRecipeDto(Recipe recipe);

}
