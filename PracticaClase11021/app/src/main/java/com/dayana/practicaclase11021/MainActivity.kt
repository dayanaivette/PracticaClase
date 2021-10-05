package com.dayana.practicaclase11021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        E1("Dayana Ivette", 25.5, 500, 45)
        E2(6)

        var empleado = Empleado()
        empleado.sueldo = 350
        empleado.nombre = "Dayana"
        empleado.tiempo = 10
        empleado.cargo = "Secretaria"
        empleado.area = "RRHH"
        empleado.Resultados()

        println("Dado con valor asignado:")
        var dado = Dado(6)
        dado.lanzardado()

        println("Dado aleatorio:")
        var dadorandom = Dado()
        dadorandom.lanzardado()
    }

    fun E1(nombre:String, pagoHora:Double, horasTrabajadas:Int, horasExtras: Int){
        println("Nombre: $nombre")
        var pagoHoras = (pagoHora*horasExtras)
        var pagoEx = ((horasTrabajadas*2)*horasExtras)
        var pagoFinal = pagoHoras + pagoEx
        println("El Pago Total es de: $pagoFinal, $pagoHoras por $horasTrabajadas horas laborales y $pagoEx por $horasExtras horas extras")
    }

    fun E2(Tabla:Int){
        var valor: Int = 10

        for (num in 1..valor) {
            var respuesta = num*Tabla
            println("$Tabla X $num = $respuesta")
        }
    }
}