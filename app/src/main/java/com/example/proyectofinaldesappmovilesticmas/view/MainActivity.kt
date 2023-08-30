package com.example.proyectofinaldesappmovilesticmas.view
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import com.example.proyectofinaldesappmovilesticmas.databinding.ActivityMainBinding



import com.example.proyectofinaldesappmovilesticmas.R

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.resultado.observe(this) {
            println("Recibimos un nuevo valor de counter. $it")
            binding.textView.text = "${it.resultado}"

        }
        binding.button.setOnClickListener(){
            val editText1Value = binding.editText.text.toString()
            val editText2Value = binding.editText2.text.toString()
            mainViewModel.compararTextos(editText1Value , editText2Value )


        }








       // setContentView(R.layout.activity_main)
    }
}