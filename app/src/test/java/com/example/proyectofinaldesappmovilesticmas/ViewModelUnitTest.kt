package com.example.proyectofinaldesappmovilesticmas

import org.junit.Test


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.proyectofinaldesappmovilesticmas.view.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule


import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class ViewModelUnitTest {
    private lateinit var viewModel: MainViewModel
    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel()
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun mainViewModel_testearResultadoInicialEnBlanco() = runTest {
            val value = viewModel.resultado.value?.resultado
            assertEquals("", value)
            // assertNull(value)
        }


    @Test
    fun mainViewModel_testearTextosIguales() = runTest {
        launch {
            viewModel.compararTextos("casa" , "casa")
            advanceUntilIdle()
            val res = viewModel.resultado.value?.resultado
            assertEquals("son iguales", res)
        }

    }

    @Test
    fun mainViewModel_testearTextosNoIguales() = runTest {
        launch {
            viewModel.compararTextos("casa" , "casajistan")
            advanceUntilIdle()
            val res = viewModel.resultado.value?.resultado
            assertEquals("son diferentes", res)
        }

    }
}