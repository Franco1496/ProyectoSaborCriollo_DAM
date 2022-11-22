package com.example.proyectosaborcriollo.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_TipoComprobante")
class TipoComprobante (
    @PrimaryKey
    @ColumnInfo(name = "TipoComprobante")
    val TipoComprobante: String,
    @ColumnInfo(name = "descripcion")
    val descripcion: String

)