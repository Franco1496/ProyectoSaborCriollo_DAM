package com.example.proyectosaborcriollo.room

import androidx.room.*
import com.example.proyectosaborcriollo.entity.Reserva


@Dao
interface ReservaDAO {
    @Query("select *from tb_Reserva")
    fun obtenerReserva():List<Reserva>

    @Query("select * from tb_Reserva where idReserva= :idReserva")
    fun obtenerReservaById(idReserva: Int): Reserva

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun RegistrarReserva()

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun ActualizarReserva(telefono: String,
                          fechaReserva: String,
                          horaReserva:Int,
                          cantidadPersonas:Int,
                          observacion:String,
                          estado:Int):Reserva

    @Query("delete from tb_reserva where idReserva= :idReserva")
    fun EliminarReserva(idReserva:Int):Reserva
}