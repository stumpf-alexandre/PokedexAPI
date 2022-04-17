package com.example.pokedexapi.api

import com.example.pokedexapi.model.Pokedex
import retrofit2.http.GET
import io.reactivex.Observable

interface IPokemonList {
    @get:GET("pokedex.json")
    val listPokemon: Observable<Pokedex>
}