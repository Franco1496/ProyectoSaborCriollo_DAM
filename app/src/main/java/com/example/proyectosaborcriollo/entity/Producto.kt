package com.example.proyectosaborcriollo.entity


import androidx.room.*

@Entity(tableName = "tb_Producto",
    foreignKeys = [
        ForeignKey(entity = Categoria::class,
            parentColumns = ["name"],
            childColumns = ["idCategoria"])
    ],
    indices = [
        Index(value = ["idCategoria"])])
class Producto (
    @PrimaryKey
    @ColumnInfo(name = "idProducto")
    val idProducto: Int,
    @ColumnInfo(name = "descripcion")
    val descripcion: String,
    @ColumnInfo(name = "idCategoria") /*foreign key*/
    val idCategoria: Int,
    @ColumnInfo(name = "stock")
    val stock: Int
):java.io.Serializable {
}