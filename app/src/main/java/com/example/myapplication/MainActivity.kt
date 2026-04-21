package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var etNama: EditText
    private lateinit var rgKelamin: RadioGroup
    private lateinit var rbLaki: RadioButton
    private lateinit var rbPerempuan: RadioButton
    private lateinit var cbMembaca: CheckBox
    private lateinit var cbCoding: CheckBox
    private lateinit var cbOlahraga: CheckBox
    private lateinit var cbMusik: CheckBox
    private lateinit var btnTampilkan: Button
    private lateinit var tvHasil: TextView
    private lateinit var cardHasil: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNama       = findViewById(R.id.etNama)
        rgKelamin    = findViewById(R.id.rgKelamin)
        rbLaki       = findViewById(R.id.rbLaki)
        rbPerempuan  = findViewById(R.id.rbPerempuan)
        cbMembaca    = findViewById(R.id.cbMembaca)
        cbCoding     = findViewById(R.id.cbCoding)
        cbOlahraga   = findViewById(R.id.cbOlahraga)
        cbMusik      = findViewById(R.id.cbMusik)
        btnTampilkan = findViewById(R.id.btnTampilkan)
        tvHasil      = findViewById(R.id.tvHasil)
        cardHasil    = findViewById(R.id.cardHasil)

        btnTampilkan.setOnClickListener {
            tampilkanData()
        }
    }

    private fun tampilkanData() {
        val nama = etNama.text.toString().trim()

        if (nama.isEmpty()) {
            etNama.error = "Nama tidak boleh kosong!"
            etNama.requestFocus()
            Toast.makeText(this, "⚠ Nama tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            cardHasil.visibility = View.GONE
            return
        } else {
            etNama.error = null
        }

        if (rgKelamin.checkedRadioButtonId == -1) {
            Toast.makeText(this, "⚠ Jenis kelamin harus dipilih!", Toast.LENGTH_SHORT).show()
            cardHasil.visibility = View.GONE
            return
        }

        val kelamin = when (rgKelamin.checkedRadioButtonId) {
            R.id.rbLaki      -> "Laki-laki"
            R.id.rbPerempuan -> "Perempuan"
            else             -> "-"
        }

        val hobiList = mutableListOf<String>()
        if (cbMembaca.isChecked)  hobiList.add("Membaca")
        if (cbCoding.isChecked)   hobiList.add("Coding")
        if (cbOlahraga.isChecked) hobiList.add("Olahraga")
        if (cbMusik.isChecked)    hobiList.add("Musik")

        val hobi = if (hobiList.isEmpty()) "Tidak ada hobi dipilih" else hobiList.joinToString(", ")

        val hasil = """
            |Nama     : $nama
            |Kelamin  : $kelamin
            |Hobi     : $hobi
        """.trimMargin()

        tvHasil.text = hasil
        cardHasil.visibility = View.VISIBLE
        Toast.makeText(this, "✅ Data berhasil ditampilkan!", Toast.LENGTH_SHORT).show()
    }
}