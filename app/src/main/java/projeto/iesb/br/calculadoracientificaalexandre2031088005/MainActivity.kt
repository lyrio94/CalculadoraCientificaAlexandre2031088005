package projeto.iesb.br.calculadoracientificaalexandre2031088005

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMain = findViewById<TextView>(R.id.tvRegister)
        val tvSecundary = findViewById<TextView>(R.id.tvSecundary)
        val tvSin = findViewById<TextView>(R.id.tvSin)
        val tvCos = findViewById<TextView>(R.id.tvCos)
        val tvTan = findViewById<TextView>(R.id.tvTan)
        val tvElevate = findViewById<TextView>(R.id.tvElevate)
        val tvLn = findViewById<TextView>(R.id.tvLn)
        val tvLg = findViewById<TextView>(R.id.tvLg)
        val tvFatorial = findViewById<TextView>(R.id.tvFatorial)
        val tvRparentheses = findViewById<TextView>(R.id.tvRparentheses)
        val tvLparentheses = findViewById<TextView>(R.id.tvLparentheses)
        val tvSquareroot = findViewById<TextView>(R.id.tvSquareroot)
        val tvClear = findViewById<TextView>(R.id.tvClear)
        val tvBackspace = findViewById<TextView>(R.id.tvBackspace)
        val tvPercentage = findViewById<TextView>(R.id.tvPercentage)
        val tvFraction = findViewById<TextView>(R.id.tvFraction)
        val tvNumber7 = findViewById<TextView>(R.id.tvNumber7)
        val tvnumber8 = findViewById<TextView>(R.id.tvNumber8)
        val tvNumber9 = findViewById<TextView>(R.id.tvNumber9)
        val tvMultiply = findViewById<TextView>(R.id.tvMultiply)
        val tvDivision = findViewById<TextView>(R.id.tvDivision)
        val tvNumber4 = findViewById<TextView>(R.id.tvNumber4)
        val tvNumber5 = findViewById<TextView>(R.id.tvNumber5)
        val tvNumber6 = findViewById<TextView>(R.id.tvNumber6)
        val tvMinus = findViewById<TextView>(R.id.tvMinus)
        val tvPi = findViewById<TextView>(R.id.tvPi)
        val tvNumber = findViewById<TextView>(R.id.tvNumber)
        val tvNumber2 = findViewById<TextView>(R.id.tvNumber2)
        val tvNumber3 = findViewById<TextView>(R.id.tvNumber3)
        val tvPlus = findViewById<TextView>(R.id.tvPlus)
        val tvNumber0 = findViewById<TextView>(R.id.tvNumber0)
        val tvDot = findViewById<TextView>(R.id.tvDot)
        val tvEqual = findViewById<TextView>(R.id.tvEqual)

        tvSin.setOnClickListener {
            tvMain.text = ("""
                    """ + tvMain.text.toString() + "sin" + """
                    """).trimIndent()
        }
        tvCos.setOnClickListener {
            tvMain.text = ("""
                    """ + tvMain.text.toString() + "cos" + """
                    """).trimIndent()
        }
        tvTan.setOnClickListener {
            tvMain.text = ("""
                    """ + tvMain.text.toString() + "tan" + """
                    """).trimIndent()
        }
        tvElevate.setOnClickListener {
            tvMain.text = ("""
                    """ + tvMain.text.toString() + "x^y" + """
                    """).trimIndent()
        }
        tvLg.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvLg.text.toString() + "" + """
                    """).trimIndent()
        }
        tvLparentheses.setOnClickListener {
            tvMain.text = ("""
                    """ + tvMain.text.toString() + ")" + """
                    """).trimIndent()
        }
        tvRparentheses.setOnClickListener {
            tvMain.text = ("""
                    """ + tvMain.text.toString() + "(" + """
                    """).trimIndent()
        }
        tvSquareroot.setOnClickListener {
            val `val` = tvMain.text.toString()
            val r = sqrt(`val`.toDouble())
            val result = r.toString()
            tvMain.text = result
            tvSecundary.text=
                    ("""
                    """ + "√$`val`" +  "\n" + "" + """
                    """).trimIndent()
        }
        tvClear.setOnClickListener {
            tvMain.text = ""
            tvSecundary.text=""
        }
        tvBackspace.setOnClickListener {
            var `val` = tvMain.text.toString()
            `val` = `val`.substring(0, `val`.length - 1)
            tvMain.text = `val`
        }
        tvPercentage.setOnClickListener {
            var `val` = tvMain.text.toString().toDouble()
            `val` /= 100
            tvMain.text = ("""
                    """ + String.format("%.2f", `val`) + "" + """
                    """).trimIndent()
            val value = `val` *100
            tvSecundary.text=
                    ("""
                    """ + "$value%" +  "\n" + "" + """
                    """).trimIndent()

        }
        tvDivision.setOnClickListener {
            val `val` = tvMain.text.toString()
            if (`val` != "") {
                tvMain.text = ("""
                    """ + `val` + tvDivision.text.toString() + "" + """
                    """).trimIndent()
            }
        }

        tvFatorial.setOnClickListener {
                val value = tvMain.text.toString().toInt()
            var i = 1
            var factorial: Long = 1
            while (i <= value) {
                factorial *= i.toLong()
                i++
            }
            tvMain.text = factorial.toString()
            tvSecundary.text=
                    ("""
                    """ + "$value!" +  "\n" + "" + """
                    """).trimIndent()
        }

        tvMultiply.setOnClickListener {
            val `val` = tvMain.text.toString()
            if (`val` != "") {
                tvMain.text = ("""
                    """ + `val` + tvMultiply.text.toString() + "" + """
                    """).trimIndent()
            }
        }

        tvFraction.setOnClickListener {
            val `val` = tvMain.text.toString()
                tvMain.text=tvMain.text.toString()
                val r = `val`.toDouble()
                tvMain.text=("""
                    """ +  1/r + "" + """
                    """).trimIndent()
            tvSecundary.text=
                    ("""
                    """ +"1/" + `val` +  "\n" + "" + """
                    """).trimIndent()
            }
        tvNumber0.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber0.text + """
                    """).trimIndent()
        }
        tvNumber.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber.text.toString() + """
                    """).trimIndent()
        }
        tvNumber2.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber2.text.toString() + """
                    """).trimIndent()

        }
        tvNumber3.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber3.text.toString() + """
                    """).trimIndent()
        }
        tvNumber4.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber4.text.toString() + """
                    """).trimIndent()
        }
        tvNumber5.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber5.text.toString() + """
                    """).trimIndent()
        }
        tvNumber6.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber6.text.toString() + """
                    """).trimIndent()
        }
        tvNumber7.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber7.text.toString() + "" + """
                    """).trimIndent()
        }

        tvnumber8.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvnumber8.text.toString() + "" + """
                    """).trimIndent()
        }
        tvNumber9.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvNumber9.text.toString() + "" + """
                    """).trimIndent()
        }
        tvMinus.setOnClickListener {
            val `val` = tvMain.text.toString()
            val last = `val`[`val`.length - 1]
            if (last != '-') {
                tvMain.text = ("""
                    """ + `val` + tvMinus.text.toString() + """
                    """).trimIndent()
            }
        }

        tvPi.setOnClickListener {
            val `val` = tvMain.text.toString()
            val r = 3.1415 *(`val`.toDouble())
            val result = r.toString()
            tvMain.text = result
            tvSecundary.text=
                    ("""
                    """ + `val` + "*π"+ "\n" + "" + """
                    """).trimIndent()

        }

        tvPlus.setOnClickListener {
            val `val` = tvMain.text.toString()
            if (`val` != "") {
                tvMain.text = ("""
                    """ + `val` + tvPlus.text.toString() + """
                    """).trimIndent()
            }
        }

        tvDot.setOnClickListener {
            val `val` = tvMain.text.toString()
            tvMain.text = ("""
                    """ + `val` + tvDot.text + """
                    """).trimIndent()
        }
        tvEqual.setOnClickListener {
            if (tvMain.text.toString().contains("x^y")) {
                val expression = tvMain.text.toString()
                val aux = expression.replace("x^y", "Elevate")
                val array = aux.split("Elevate".toRegex()).toTypedArray()
                val x1 = array[0].toDouble()
                val x2 = array[1].toDouble()
                tvMain.text = ("""
                    """ + x1.pow(x2).toString() + """
                    """).trimIndent()
                tvSecundary.text = ("""
                    """ + expression + "\n" + "\n").trimIndent()
            } else if (tvMain.text.toString().contains("lg")) {
                val expression = tvMain.text.toString()
                val array = expression.split("lg".toRegex()).toTypedArray()
                if (array[0].isEmpty()) {
                    val aux = array[1].toDouble()
                    tvMain.text =
                            ("""
                    """ + log10(aux).toString() + """
                    """).trimIndent()
                    tvSecundary.text = ("""
                    """ + expression + "\n" + "\n").trimIndent()
                } else {
                    val aux = array[0].toDouble()
                    tvMain.text = ("""
                    """ + log10(aux).toString() + """
                    """).trimIndent()
                    tvSecundary.text = ("""
                    """ + expression + "\n" + "\n").trimIndent()
                }
            }
            else {
                val `val` = tvMain.text.toString()
                val replacedString = `val`.replace('÷', '/').replace('×', '*')
                val result: Double = Eval.eval(replacedString)
               val r = result.toString()
               tvMain.text = ("""
                    """ + r + """
                    """).trimIndent()
                tvSecundary.text = ("""
                    """ + tvSecundary.text.toString() + `val` + "\n" + "\n").trimIndent()
           }
        }

        tvLn.setOnClickListener {
            val `val` = tvMain.text.toString()
            val r = ln(`val`.toDouble())
            val result = r.toString()
            tvMain.text = result
            }
        }
    }
