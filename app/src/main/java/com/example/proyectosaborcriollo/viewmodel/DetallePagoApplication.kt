package com.example.proyectosaborcriollo.viewmodel

import android.app.Application
import com.example.proyectosaborcriollo.repository.DetallePagoRepositorio
import com.example.proyectosaborcriollo.room.BDSaborCriollo

class DetallePagoApplication: Application() {

    val bd by lazy { BDSaborCriollo.getBaseDatos(this) }

    val repo by lazy { DetallePagoRepositorio(bd.depago()) }
}