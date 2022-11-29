package com.example.proyectosaborcriollo.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_DetallePago")
class DetallePago (

    @PrimaryKey @ColumnInfo(name ="codigo") val codigo :String,
    @ColumnInfo(name = "cliente") val cliente : String,
    @ColumnInfo(name = "restaurant") val restaurante : String,
    @ColumnInfo(name = "sub-total") val sub_total : Int,
    @ColumnInfo(name = "igv") val igv : Int,
    @ColumnInfo(name = "total de ventas") val total_ventas : Int,
    @ColumnInfo(name = "metodo de pago") val metodo_pago : String


)