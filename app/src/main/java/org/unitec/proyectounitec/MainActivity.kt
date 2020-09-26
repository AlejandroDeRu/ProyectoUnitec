package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// El punto de partido de toda app es la MainActivity (Presenter)

/*
JAVA

public class TarjetaCredito extends Tarjeta{}
public TarjetaCredito(){
super();
}
 */

// super en kotlin es una palabra reservada para implementar o crear una funcion o metodo
//Vamos a probar que funciona Github, esto lo estoy editando en el repositorio.

class MainActivity : AppCompatActivity() {
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        //Vamos a eliminar la barra de la parte superior del celular (supportActionBar es un atributo), el signo ? es antes de que cargue los graficos.
        //Compilador del celular se le llama Dalvik (en java es la jvm).
        //Las sentencias no terminan en ;
        supportActionBar?.hide()
        setContentView(R.layout.ejemplito)
    }
}
