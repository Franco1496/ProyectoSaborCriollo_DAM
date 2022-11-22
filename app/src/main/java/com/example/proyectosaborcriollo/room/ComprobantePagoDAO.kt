package com.example.proyectosaborcriollo.room


import  androidx.room.Dao
import androidx.room.*
import com.example.proyectosaborcriollo.entity.ComprobantePago
import com.example.proyectosaborcriollo.entity.Pedido


@Dao
interface  ComprobantePagoDAO {
    @Query("select *from tb_comprobantepago")
    fun obtenerComprobantePago():List<ComprobantePago>

    @Query("select * from tb_comprobantepago where TipoComprobante= :TipoComprobante")
    fun obtenerPedidoById(TipoComprobante: String): ComprobantePago

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun RegistrarPedido()

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun ActualizarPedido(idTipoPedido: Int,
                         fechaHoraPedido: String,
                         totalPedido:Int,
                         idMetodoPago:Int,
                         cod_Ubigeo:String,
                         direccionPedido:String,
                         estado:Int): Pedido

    @Query("delete from tb_comprobantepago where idPedido= :idPedido")
    fun EliminarPedido(idPedido:Int): Pedido
}