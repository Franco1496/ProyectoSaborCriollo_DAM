package com.example.proyectosaborcriollo.room

import androidx.room.Dao
import androidx.room.Query
import com.example.proyectosaborcriollo.entity.Categoria

@Dao
interface CategoriaDAO {
    @Query("Select*from tb_Categoria")
    fun obtenerCategia(): List<Categoria>


}