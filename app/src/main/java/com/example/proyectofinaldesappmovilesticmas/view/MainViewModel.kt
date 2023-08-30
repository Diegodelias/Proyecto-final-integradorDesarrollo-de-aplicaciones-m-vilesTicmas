package com.example.proyectofinaldesappmovilesticmas.view
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectofinaldesappmovilesticmas.model.Resultado

class MainViewModel: ViewModel() {

    val resultado: LiveData<Resultado> get() = _resultado;

    private var _resultado = MutableLiveData<Resultado>(Resultado(""))


    fun compararTextos(texto1: String, texto2: String) {

        if (texto1 == texto2) {
            _resultado.value = Resultado("son iguales")
        } else {
            _resultado.value = Resultado("son diferentes")
        }
    }



}