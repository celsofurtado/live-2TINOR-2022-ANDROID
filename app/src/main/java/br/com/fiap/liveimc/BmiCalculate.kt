package br.com.fiap.liveimc

import kotlin.math.pow

fun bmiCalculate(weight: Int, height: Double): Double {

    return weight / height.pow(2.0)

}

fun bmiStatus(bmi: Double): String {



    return ""
}