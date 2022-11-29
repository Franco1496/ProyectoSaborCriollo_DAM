package com.example.proyectosaborcriollo.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.proyectosaborcriollo.entity.*


@Database(
    entities = [Categoria::class,
                Cliente::class,
                ComprobantePago::class,
                DetallePedido::class,
                Local::class,
                Pedido::class,
                Precio::class,
                Producto::class,
                Reserva::class,
                TipoComprobante::class,
                DetallePago::class,
                TipoPedido::class,
                TipoDocumento::class,
                MetodoPago::class,
                PrecioDelivery::class,
                Ubigeo::class,
                Usuario::class], version = 3

)
abstract class BDSaborCriollo : RoomDatabase(){

        abstract fun depago(): DetallePagoDao



    companion object{
        private var INSTANCE: BDSaborCriollo?=null
        fun getBaseDatos(context: Context):BDSaborCriollo{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(context, BDSaborCriollo::class.java, "bd_saborcriollo").
                fallbackToDestructiveMigration().build()

                INSTANCE = instance
                instance

            }
        }
    }
}