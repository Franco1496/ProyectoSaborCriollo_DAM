package com.example.proyectosaborcriollo.entity


import androidx.room.*

@Entity(tableName = "tb_Cliente",
        foreignKeys = [
            ForeignKey(entity = TipoDocumento::class,
                        parentColumns = ["name"],
                        childColumns = ["idTipoDocumento"]),
            ForeignKey(entity = Ubigeo::class,
                        parentColumns = ["name"],
                        childColumns = ["cod_Ubigeo"])
        ],
        indices = [
            Index(value = ["idTipoDocumento"]),
            Index(value = ["cod_Ubigeo"])])
class Cliente (
    @PrimaryKey
    @ColumnInfo(name = "idCliente")
    val idCliente: Int,
    @ColumnInfo(name = "nombre")
    val nombre: String,
    @ColumnInfo(name = "apellido")
    val apellido: String,
    @ColumnInfo(name = "correo")
    val correo: String,
    @ColumnInfo(name = "telefono")
    val telefono: String,
    @ColumnInfo(name = "idTipoDocumento") /*foreign key*/
    val idTipoDocumento: Int,
    @ColumnInfo(name = "documento")
    val documento: String,
    @ColumnInfo(name = "cod_Ubigeo") /*foreign key*/
    val cod_Ubigeo: String,
    @ColumnInfo(name = "direccion")
    val direccion:String

):java.io.Serializable {
}