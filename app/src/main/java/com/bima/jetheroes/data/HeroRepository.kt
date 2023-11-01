package com.bima.jetheroes.data

import com.bima.jetheroes.model.Hero
import com.bima.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}