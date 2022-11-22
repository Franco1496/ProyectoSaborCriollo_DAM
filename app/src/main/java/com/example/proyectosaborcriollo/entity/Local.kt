package com.example.proyectosaborcriollo.entity


import androidx.room.*

@Entity(tableName = "tb_Local",
    foreignKeys = [
        ForeignKey(entity = Ubigeo::class,
            parentColumns = ["name"],
            childColumns = ["cod_Ubigeo"])
    ],
    indices = [
        Index(value = ["cod_Ubigeo"])]
)
class Local (
    @PrimaryKey
    @ColumnInfo(name = "idLocal")
    val idLocal: Int,
    @ColumnInfo(name = "nombre")
    val nombre: String,
    @ColumnInfo(name = "cod_Ubigeo") /*foreign key*/
    val cod_Ubigeo: String,
    @ColumnInfo(name = "direccion")
    val direccion: String,
    @ColumnInfo(name = "telefono")
    val telefono: String,
    @ColumnInfo(name = "horarioAtencion")
    val horarioAtencion: String
):java.io.Serializable {
}