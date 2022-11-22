package com.example.proyectosaborcriollo.entity



import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "tb_Categoria")
class Categoria (
    @PrimaryKey
    @ColumnInfo(name = "idCategoria")
    val idCategoria: Int,
    @ColumnInfo(name = "nombre")
    val nombre: String
):java.io.Serializable {
}