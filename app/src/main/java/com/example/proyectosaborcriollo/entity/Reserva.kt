package com.example.proyectosaborcriollo.entity


import androidx.room.*

@Entity(tableName = "tb_Reserva",
    foreignKeys = [
        ForeignKey(entity = Local::class,
            parentColumns = ["name"],
            childColumns = ["idLocal"])
    ],
    indices = [
        Index(value = ["idLocal"])])
class Reserva (
    @PrimaryKey
    @ColumnInfo(name = "idReserva")
    val idReserva: Int,
    @ColumnInfo(name = "idLocal") /*foreign key*/
    val idLocal: Int,
    @ColumnInfo(name = "nombreCliente")
    val nombreCliente: String,
    @ColumnInfo(name = "apellidoCliente")
    val apellidoCliente: String,
    @ColumnInfo(name = "documento")
    val documento: String,
    @ColumnInfo(name = "correoCliente")
    val correoCliente: String,
    @ColumnInfo(name = "telefono")
    val telefono: String,
    @ColumnInfo(name = "fechaReserva")
    val fechaReserva: String,
    @ColumnInfo(name = "horaReserva")
    val horaReserva: Int,
    @ColumnInfo(name = "cantidadPersonas")
    val cantidadPersonas: Int,
    @ColumnInfo(name = "observacion")
    val observacion: String,
    @ColumnInfo(name = "estado")
    val estado: Int
):java.io.Serializable {
}