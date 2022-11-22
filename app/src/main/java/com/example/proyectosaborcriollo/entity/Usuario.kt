package com.example.proyectosaborcriollo.entity



import androidx.room.*

@Entity(tableName = "tb_Usuario",
    foreignKeys = [
        ForeignKey(entity = TipoDocumento::class,
            parentColumns = ["name"],
            childColumns = ["idTipoDocumento"],
        )
    ],
    indices = [
        Index(value = ["idTipoDocumento"])])
class Usuario (
    @PrimaryKey
    @ColumnInfo(name = "idUsuario")
    val idUsuario: Int,
    @ColumnInfo(name = "nombre")
    val nombre: String,
    @ColumnInfo(name = "apellido")
    val apellido: String,
    @ColumnInfo(name = "telefono")
    val telefono: String,
    @ColumnInfo(name = "idTipoDocumento") /*foreign key*/
    val idTipoDocumento: Int,
    @ColumnInfo(name = "documento")
    val documento: String,
    @ColumnInfo(name = "correo")
    val correo: String,
    @ColumnInfo(name = "clave")
    val clave: String
):java.io.Serializable {
}