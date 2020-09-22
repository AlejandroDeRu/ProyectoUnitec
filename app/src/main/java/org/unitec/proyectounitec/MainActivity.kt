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

class MainActivity : AppCompatActivity() {
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        setContentView(R.layout.activity_main)
    }
}