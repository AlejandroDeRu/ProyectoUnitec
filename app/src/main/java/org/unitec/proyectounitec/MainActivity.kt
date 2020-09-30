package org.unitec.proyectounitec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.ejemplito.*

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

        //Aqui vamos a introducir la primera parte de codigo verdadedamente de kotlin
        botoncito.setOnClickListener {
            //Declarar variable de tipo Intent en kotlin
            // int x;
            //var x:Int
            // var x=4
            var i=Intent(this,ComandoVozActivity::class.java)

            //Lo invocamos
            startActivity(i)

        }
    }
}
