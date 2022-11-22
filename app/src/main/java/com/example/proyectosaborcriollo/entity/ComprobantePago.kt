package com.example.proyectosaborcriollo.entity

import androidx.room.*

@Entity(tableName = "tb_ComprobantePago",
        foreignKeys = [
            ForeignKey(entity = TipoComprobante::class,
                parentColumns = ["name"],
                childColumns = ["TipoComprobante"]),
            ForeignKey(entity = Pedido::class,
                parentColumns = ["name"],
                childColumns = ["idPedido"]),
            ForeignKey(entity = TipoPedido::class,
                parentColumns = ["name"],
                childColumns = ["idTipoPedido"])
        ],
        indices = [
            Index(value = ["idPedido"]),
            Index(value = ["idTipoPedido"])],
        primaryKeys = ["TipoComprobante","NumComprobante"])
class ComprobantePago (
    @ColumnInfo(name = "TipoComprobante") /*foreign key*/
    val TipoComprobante: String,
    @ColumnInfo(name = "NumComprobante")
    val NumComprobante: Int,
    @ColumnInfo(name = "idPedido") /*foreign key*/
    val idPedido: Int,
    @ColumnInfo(name = "idTipoPedido") /*foreign key*/
    val idTipoPedido: Int,
    @ColumnInfo(name = "subtotal")
    val subtotal: Double,
    @ColumnInfo(name = "igv")
    val igv: Double,
    @ColumnInfo(name = "ImporteTotal")
    val ImporteTotal: Double
):java.io.Serializable {
}