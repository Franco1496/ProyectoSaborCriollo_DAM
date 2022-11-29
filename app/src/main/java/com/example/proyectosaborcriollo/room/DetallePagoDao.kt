package com.example.proyectosaborcriollo.room

import androidx.room.*
import com.example.proyectosaborcriollo.entity.DetallePago
import kotlinx.coroutines.flow.Flow


@Dao
interface DetallePagoDao {

    @Query("select * from tb_DetallePago order by codigo")
    fun obtenerTodoDetallePago(): Flow<List<DetallePago>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun agregarDetallePago(detallePago: DetallePago)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun editarDetallePago(detallePago: DetallePago)

    @Query("delete from tb_DetallePago where codigo = :cod")
    suspend fun eliminarDetallePago(cod:String)



}