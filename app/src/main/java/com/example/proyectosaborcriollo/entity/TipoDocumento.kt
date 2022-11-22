package com.example.proyectosaborcriollo.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_TipoDocumento")
class TipoDocumento (
    @PrimaryKey
    @ColumnInfo(name = "idTipoDocumento")
    val idTipoDocumento: Int,
    @ColumnInfo(name = "descripcion")
    val descripcion: String
)