package com.example.proyectosaborcriollo.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_DetallePedido"/*,
        foreignKeys = [
            ForeignKey(entity = Pedido::class,
                        parentColumns = ["name"],
                        childColumns = ["idPedido"],
            ),
            ForeignKey(entity = Producto::class,
                parentColumns = ["name"],
                childColumns = ["idProducto"]
            ),
            ForeignKey(entity = Precio::class,
                parentColumns = ["name"],
                childColumns = ["idPrecio"]
            ),
        ],
        indices = [
            Index(value = ["idPedido"]),
            Index(value = ["idProducto"]),
            Index(value = ["idPrecio"])] */)
class DetallePedido (
    @PrimaryKey
    @ColumnInfo(name = "idDetallePedido")
    val idDetallePedido: Int,
    @ColumnInfo(name = "idPedido") /*foreign key*/
    val idPedido: Int,
    @ColumnInfo(name = "idProducto") /*foreign key*/
    val idProducto: Int,
    @ColumnInfo(name = "cantidad")
    val cantidad: Int,
    @ColumnInfo(name = "idPrecio") /*foreign key*/
    val idPrecio: Int
):java.io.Serializable {
}