package com.example.recipefinderapp.ui.theme.viewmodel

sealed class RecipeViewIntent {
    object LoadRandomRecipe : RecipeViewIntent()
    data class SearchRecipe(val query: String) : RecipeViewIntent()
}
