package com.example.proyectosaborcriollo.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "tb_Pedido",
    foreignKeys = [
        ForeignKey(entity = Cliente::class,
            parentColumns = ["name"],
            childColumns = ["idCliente"]),
        ForeignKey(entity = TipoPedido::class,
            parentColumns = ["name"],
            childColumns = ["idTipoPedido"]),
        ForeignKey(entity = MetodoPago::class,
            parentColumns = ["name"],
            childColumns = ["idMetodoPago"]),
        ForeignKey(entity = Ubigeo::class,
            parentColumns = ["name"],
            childColumns = ["cod_Ubigeo"])
    ])
 class Pedido(
    @PrimaryKey
    @ColumnInfo(name = "idPedido")
    val idPedido: Int = 0,
    @ColumnInfo(name = "idCliente") /*foreign key*/
    val idCliente: Int,
    @ColumnInfo(name = "idTipoPedido") /*foreign key*/
    val idTipoPedido: Int,
    @ColumnInfo(name = "fechaHoraPedido")
    val fechaHoraPedido: String,
    @ColumnInfo(name = "totalPedido")
    val totalPedido: Double,
    @ColumnInfo(name = "idMetodoPago") /*foreign key*/
    val idMetodoPago: Int,
    @ColumnInfo(name = "cod_Ubigeo") /*foreign key*/
    val cod_Ubigeo: String,
    @ColumnInfo(name = "direccionPedido")
    val direccionPedido: String,
    @ColumnInfo(name = "estado")
    val estado: Int
) {
    override fun toString(): String {
        return "Pedido(idPedido=$idPedido, idCliente=$idCliente, idTipoPedido=$idTipoPedido, " +
                " fechaHoraPedido=$fechaHoraPedido, totalPedido=$totalPedido ,idMetodoPago=$idMetodoPago, " +
                " cod_Ubigeo='$cod_Ubigeo', direccionPedido='$direccionPedido', estado=$estado)"
    }
}
/*):java.io.Serializable {
}*/