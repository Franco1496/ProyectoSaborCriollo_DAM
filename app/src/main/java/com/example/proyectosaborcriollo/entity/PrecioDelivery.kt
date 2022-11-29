package com.example.proyectosaborcriollo.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_PrecioDelivery"/*,
    foreignKeys = [
        ForeignKey(entity = Ubigeo::class,
            parentColumns = ["name"],
            childColumns = ["cod_Ubigeo"])
    ]*/)
class PrecioDelivery (
    @PrimaryKey
    @ColumnInfo(name = "idDelivery")
    val idDelivery: Int,
    @ColumnInfo(name = "cod_Ubigeo") /*foreign key*/
    val cod_Ubigeo: String,
    @ColumnInfo(name = "Costo")
    val Costo: Double
)