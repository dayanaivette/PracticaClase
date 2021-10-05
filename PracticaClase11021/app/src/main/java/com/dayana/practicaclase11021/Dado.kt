package com.dayana.practicaclase11021

class Dado(var numero:Int? = null) {

    fun lanzardado() {
        var finalnumber = 1
        var valor = numero
        if (valor != null) {
            if (valor >= 1 && valor <= 6) {
                finalnumber = valor
                println("El numero resultante es: $finalnumber")
            } else {
                finalnumber = 1
                println("El numero resultante es: $finalnumber")
            }

            }   else {
                var numeroaletorio = (1..6).random()
                println("El numero resultante es: $numeroaletorio")
            }
        }
    }
