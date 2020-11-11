package com.example.android.restoran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.restoran.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val productSatu: Product = Product()
    val productDua: Product = Product()
    val productTiga: Product = Product()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.productSatu = productSatu
        binding.productDua = productDua
        binding.productTiga = productTiga

    }


    fun mejaSatu(view: View) {
        binding.apply {
            if (mejasatu.isClickable) {
                nomormeja.text = "Meja 4"
                layoutMeja.visibility = View.GONE
                layoutMenu.visibility = View.VISIBLE
                layoutBayar.visibility = View.GONE
            }
        }
    }

    fun mejaDua(view: View) {
        binding.apply {
            if (mejadua.isClickable) {
                nomormeja.text = "Meja 4"
                layoutMeja.visibility = View.GONE
                layoutMenu.visibility = View.VISIBLE
                layoutBayar.visibility = View.GONE
            }
        }
    }

    fun mejaTiga(view: View) {
        binding.apply {
            if (mejatiga.isClickable) {
                nomormeja.text = "Meja 4"
                layoutMeja.visibility = View.GONE
                layoutMenu.visibility = View.VISIBLE
                layoutBayar.visibility = View.GONE
            }
        }
    }

    fun mejaEmpat(view: View) {
        binding.apply {
            if (mejaempat.isClickable) {
                nomormeja.text = "Meja 4"
                layoutMeja.visibility = View.GONE
                layoutMenu.visibility = View.VISIBLE
                layoutBayar.visibility = View.GONE
            }
        }
    }

    fun hitung(view: View) {
        productSatu.namaMenu = namaMakanan1.text.toString()
        productSatu.hargaMenu = hargaMakanan1.text.toString().toInt()
        productSatu.jumlahMenu = jumlahMakanan1.text.toString().toInt()

        productDua.namaMenu = namaMakanan2.text.toString()
        productDua.hargaMenu = hargaMakanan2.text.toString().toInt()
        productDua.jumlahMenu = jumlahMakanan2.text.toString().toInt()

        productTiga.namaMenu = namaMakanan3.text.toString()
        productTiga.hargaMenu = hargaMakanan3.text.toString().toInt()
        productTiga.jumlahMenu = jumlahMakanan3.text.toString().toInt()

        var total1 = productSatu.hargaMenu * productSatu.jumlahMenu
        var total2 = productDua.hargaMenu * productDua.jumlahMenu
        var total3 = productTiga.hargaMenu * productTiga.jumlahMenu
        var grandtotal = total1 + total2 + total3
        var nomorMeja = nomormeja.text.toString()

        binding.apply {
            tvTotal1.text = total1.toString().toInt().toString()
            tvTotal2.text = total2.toString().toInt().toString()
            tvTotal3.text = total3.toString().toInt().toString()
            tvGrandtotal.text = "Rp. " + grandtotal.toString().toInt().toString()

        }

        if (hitungButton.isClickable) {
            binding.apply {
                if (hitungButton.isClickable) {
                    nomormeja.text = "Meja 1"
                    layoutMeja.visibility = View.GONE
                    layoutMenu.visibility = View.GONE
                    layoutBayar.visibility = View.VISIBLE
                }
            }
        }
            fun kembaliKeMeja(view: View) {
                binding.apply {
                    if (buttonKembali1.isClickable) {
                        nomormeja.text = "Meja 1"
                        layoutMeja.visibility = View.GONE
                        layoutMenu.visibility = View.VISIBLE
                        layoutBayar.visibility = View.GONE
                    }
                }
            }
                fun kembaliKeMenu(view: View) {
                    binding.apply {
                        if (buttonKembali2.isClickable) {
                            nomormeja.text = "Meja 1"
                            layoutMeja.visibility = View.GONE
                            layoutMenu.visibility = View.VISIBLE
                            layoutBayar.visibility = View.GONE
                        }
                    }
                }
            }
        }