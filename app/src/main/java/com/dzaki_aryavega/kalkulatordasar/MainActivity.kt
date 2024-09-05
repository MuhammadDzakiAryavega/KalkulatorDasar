package com.dzaki_aryavega.kalkulatordasar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var angka1 : EditText
    private lateinit var angka2 : EditText
    private lateinit var tambah : Button
    private lateinit var kurang : Button
    private lateinit var kali : Button
    private lateinit var bagi : Button
    private lateinit var hasilnya : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        angka1 = findViewById(R.id.angka1)
        angka2 = findViewById(R.id.angka2)
        tambah = findViewById(R.id.tambah)
        kurang = findViewById(R.id.kurang)
        kali = findViewById(R.id.kali)
        bagi = findViewById(R.id.bagi)
        hasilnya = findViewById(R.id.hasil)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        tambah.setOnClickListener(){

            val nAngka1 = angka1.text.toString().toInt()
            val nAngka2 = angka2.text.toString().toInt()

            val hasil = nAngka1 + nAngka2
            hasilnya.setText("Hasilnya = " + hasil)
        }

        kurang.setOnClickListener(){

            val nAngka1 = angka1.text.toString().toInt()
            val nAngka2 = angka2.text.toString().toInt()

            val hasil = nAngka1 - nAngka2
            hasilnya.setText("Hasilnya = " + hasil)
        }

        kali.setOnClickListener(){

            val nAngka1 = angka1.text.toString().toInt()
            val nAngka2 = angka2.text.toString().toInt()

            val hasil = nAngka1 * nAngka2
            hasilnya.setText("Hasilnya = " + hasil)
        }

        bagi.setOnClickListener(){

            val nAngka1 = angka1.text.toString().toInt()
            val nAngka2 = angka2.text.toString().toInt()

            val hasil = nAngka1 / nAngka2
            hasilnya.setText("Hasilnya = " + hasil)
        }

    }
}