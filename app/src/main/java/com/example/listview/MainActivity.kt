package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding
import com.example.listview.databinding.ActivityShortBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        val valores = arrayOf(
            "C++", "Python", "JavaScript", "Kotlin", "Java", ".NET",
            "Perl", "PHP", "Haskell", "Rust", "MySQL", "Velazquez", "VisualBasic",
            "Cobol", "Go", "Pascal", "TypeScript", "Lisp", "Swift"
        )
//        val myAdaptador2 = ArrayAdapter.createFromResource(this,
//            R.array.Languages, android.R.layout.)
        val myAdaptador = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, valores
        )
        b.listViewTest.adapter = myAdaptador
        //b.listViewTest.choiceMode = ListView.CHOICE_MODE_SINGLE // <- para la simple_list_item_single_choice (RadioButton)
        //b.listViewTest.choiceMode = ListView.CHOICE_MODE_MULTIPLE // <- para la simple_list_item_multiple_choice (CheckBox)
        b.listViewTest.setOnItemClickListener { adapterView, view, i, l -> //<- para la simple_list_item_1 (la que hay)
            val elemento = myAdaptador.getItem(i) as String

            Toast.makeText(this, elemento, Toast.LENGTH_LONG).show()
        }
        b.listViewTest.setOnItemClickListener { adapterView, view, d, l ->
            Toast.makeText( adapterView.context, d.toString(), Toast.LENGTH_LONG).show()
            true
        }
    }
}
//        b.listViewTest.setOnItemClickListener { parent:AdapterView<*>, view: View, position:Int,
//                                                id: Long ->
//            val elemento = myAdaptador.getItem(position) as String
//            Toast.makeText(this, elemento, Toast.LENGTH_LONG).show()
//        }
//
//        b.listViewTest.setOnItemLongClickListener { parent: AdapterView<*>, view: View, pos: Int,
//                                                    id: Long ->
//            Toast.makeText(parent.context, pos.toString(), Toast.LENGTH_LONG).show()
//            true
//        }

//binding.btn0.setOnClickListener {
//    val myIntent = Intent(this, ResultActivity::class.java)
//    myIntent.putExtra("INTENT_MAIL", binding.btn0.text)
//    myIntent.putExtra("INTENT_PHONE", binding.btn1.text)
//    myIntent.putExtra("INTENT_PASS", binding.btn1.text)
//    startActivity(myIntent)