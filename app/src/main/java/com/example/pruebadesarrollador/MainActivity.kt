package com.example.pruebadesarrollador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIngresar=findViewById<Button>(R.id.btn_ingresar)
        val etUsuario=findViewById<EditText>(R.id.et_usuario)
        val etContraseña=findViewById<EditText>(R.id.et_contraseña)
        Ingresar(btnIngresar,etUsuario,etContraseña)
    }
    private fun Ingresar(btnIngresar:Button,etUsuario:EditText,etContraseña:EditText){
        btnIngresar.setOnClickListener {
            if (etUsuario.text.toString()=="Administrador" && etContraseña.text.toString()=="12345"){
                Toast.makeText(this, "Inicio de sesion exitoso", Toast.LENGTH_SHORT).show()
            }else if(etUsuario.text.toString()=="" && etContraseña.text.toString()==""){
                Toast.makeText(this, "Por favor llene ambos campos", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "Error usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }
}