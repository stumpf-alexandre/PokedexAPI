package com.example.pokedexapi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokedexapi.R
import com.example.pokedexapi.model.Pokemon

class PokemonListAdapter(internal var contex: Context, internal var pokemonList: List<Pokemon>): RecyclerView.Adapter<PokemonListAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        internal var img_pokemon: ImageView
        internal var txt_pokemon: TextView
        init {
            img_pokemon = itemView.findViewById(R.id.iv_pokemon) as ImageView
            txt_pokemon = itemView.findViewById(R.id.tv_pokemon) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View = LayoutInflater.from(contex).inflate(R.layout.pokemon_list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(contex).load(pokemonList[position].img).into(holder.img_pokemon)
        holder.txt_pokemon.text = pokemonList[position].name
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }
}