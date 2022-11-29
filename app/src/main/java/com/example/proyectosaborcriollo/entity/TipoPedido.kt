package com.example.proyectosaborcriollo.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_TipoPedido" /*,
    foreignKeys = [
        ForeignKey(entity = PrecioDelivery::class,
            parentColumns = ["name"],
            childColumns = ["idDelivery"])
    ]

   */
    )
class TipoPedido (
    @PrimaryKey
    @ColumnInfo(name = "idTipoPedido")
    val idTipoPedido: Int,
    @ColumnInfo(name = "descripcion")
    val descripcion: String,
    @ColumnInfo(name = "idDelivery") /*foreign key*/
    val idDelivery: Int
):java.io.Serializable {
}