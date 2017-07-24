package com.epam.ration.dao;

import com.epam.ration.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    public Recipe findRecipeByName(String name);

}
