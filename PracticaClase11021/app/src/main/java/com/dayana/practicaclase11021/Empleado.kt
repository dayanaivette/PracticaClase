package com.dayana.practicaclase11021

class Empleado() {
    var sueldo = 0
        get() = field
        set(value) {
            if(value<0){
                println("Ingrese correctamente su sueldo")
            }else{
                field = value
            }
        }

    var nombre:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Rellene el campo vacío")
            }
            else if(value!!.isEmpty()) {
                println("Complete los campos")
            }else{
                field = value
            }
        }
    var area:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Rellene el campo vacío")
            }
            else if(value!!.isEmpty()) {
                println("Complete los campos")
            }else{
                field = value
            }
        }

    var cargo:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Rellene el campo vacío")
            }
            else if(value!!.isEmpty()) {
                println("Complete los campos")
            }else{
                field = value
            }
        }

    var tiempo:Int = 0
        get() = field
        set(value) {
            field = value
        }

    public fun verificacion(): Int {
        return (tiempo.div(5))
    }

    public fun Resultados(){
        if( nombre == null ||  cargo == null ||  area == null){
            println("Aún hay campos vacios")
        }else{
            var sueldoextra = 25 * verificacion()
            var sueldototal = sueldo + sueldoextra
            println("Empleado: $nombre, Area de desempeño: $area, Cargo: $cargo, sueldo: $sueldo, Tiempo laborado: $tiempo, Remuneracion: $sueldoextra, Sueldo Total: $sueldototal")
        }
    }
}