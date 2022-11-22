package com.example.proyectosaborcriollo.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Ubigeo")
class Ubigeo (
    @PrimaryKey
    @ColumnInfo(name = "cod_Ubigeo")
    val cod_Ubigeo: String,
    @ColumnInfo(name = "departamento")
    val departamento: String,
    @ColumnInfo(name = "provincia")
    val provincia: String,
    @ColumnInfo(name = "distrito")
    val distrito: String
):java.io.Serializable {
}