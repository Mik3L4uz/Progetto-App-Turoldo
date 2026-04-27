package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri

class MainActivity : AppCompatActivity() {

    lateinit var BottoneOrario: Button
    lateinit var BottonePTOF: Button
    lateinit var BottoneRegistro: Button
    lateinit var BottoneLibri: Button
    lateinit var BottoneCircolari: Button
    lateinit var url: String        // URL a cui puntano bottoni

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        BottoneOrario = findViewById<Button>(R.id.Orario)
        BottonePTOF = findViewById<Button>(R.id.PTOF)
        BottoneRegistro = findViewById<Button>(R.id.Registro)
        BottoneLibri = findViewById<Button>(R.id.Libri)



        BottoneOrario.setOnClickListener { v ->
            url = "https://www.istitutoturoldo.edu.it/didattica/calendario-scolastico/orario-scolastico/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        BottonePTOF.setOnClickListener { v ->
            url = "https://www.istitutoturoldo.edu.it/documento/regolamento-istituto/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        BottoneRegistro.setOnClickListener { v ->
            url =  "https://www.istitutoturoldo.edu.it/servizio/registro-elettronico-docenti/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        BottoneLibri.setOnClickListener { v ->
            url =  "https://www.istitutoturoldo.edu.it/didattica/adozioni-libri-di-testo/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}