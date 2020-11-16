package projeto.iesb.br.calculadoracientificaalexandre2031088005

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*

open class MainActivity : AppCompatActivity() {
    private lateinit var tvmain: TextView
    public lateinit var tvsecundary: TextView

    //private lateinit var tv2nd: TextView
    //private lateinit var tvdeg: TextView
    //private lateinit var tve: TextView
    private lateinit var tvIn: TextView
    private lateinit var tvsin: TextView
    private lateinit var tvcos: TextView
    private lateinit var tvtan: TextView
    private lateinit var tvelevate: TextView
    private lateinit var tvlg: TextView
    private lateinit var tvLparentheses: TextView
    private lateinit var tvRparentheses: TextView
    private lateinit var tvsquareroot: TextView
    private lateinit var tvclear: TextView
    private lateinit var tvbackspace: TextView
    private lateinit var tvpercentage: TextView
    private lateinit var tvfatorial: TextView
    private lateinit var tvfraction: TextView
    private lateinit var tvdivision: TextView
    private lateinit var tvnumber7: TextView
    private lateinit var tvnumber8: TextView
    private lateinit var tvnumber9: TextView
    private lateinit var tvmultiply: TextView
    private lateinit var tvnumber4: TextView
    private lateinit var tvnumber5: TextView
    private lateinit var tvnumber6: TextView
    private lateinit var tvminus: TextView
    private lateinit var tvpi: TextView
    private lateinit var tvnumber: TextView
    private lateinit var tvnumber2: TextView
    private lateinit var tvnumber3: TextView
    private lateinit var tvplus: TextView
    private lateinit var tvnumber0: TextView
    private lateinit var tvdot: TextView
    private lateinit var tvequal: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvmain = findViewById(R.id.tvregister)
        tvsecundary = findViewById(R.id.tvsecundary)
        tvsin = findViewById(R.id.tvsin)
        tvcos = findViewById(R.id.tvcos)
        tvtan = findViewById(R.id.tvtan)
        tvelevate = findViewById(R.id.tvelevate)
        tvIn = findViewById(R.id.tvIn)
        tvlg = findViewById(R.id.tvlg)
        tvfatorial = findViewById(R.id.tvfatorial)
        tvRparentheses = findViewById(R.id.tvopenparentheses)
        tvLparentheses = findViewById(R.id.tvcloseparentheses)
        tvsquareroot = findViewById(R.id.tvsquareroot)
        tvclear = findViewById(R.id.tvclear)
        tvbackspace = findViewById(R.id.tvbackspace)
        tvpercentage = findViewById(R.id.tvpercentage)
        tvfraction = findViewById(R.id.tvfraction)
        tvnumber7 = findViewById(R.id.tvnumber7)
        tvnumber8 = findViewById(R.id.tvnumber8)
        tvnumber9 = findViewById(R.id.tvnumber9)
        tvmultiply = findViewById(R.id.tvmultiply)
        tvdivision = findViewById(R.id.tvdivision)
        tvnumber4 = findViewById(R.id.tvnumber4)
        tvnumber5 = findViewById(R.id.tvnumber5)
        tvnumber6 = findViewById(R.id.tvnumber6)
        tvminus = findViewById(R.id.tvminus)
        tvpi = findViewById(R.id.tvpi)
        tvnumber = findViewById(R.id.tvnumber)
        tvnumber2 = findViewById(R.id.tvnumber2)
        tvnumber3 = findViewById(R.id.tvnumber3)
        tvplus = findViewById(R.id.tvplus)
        tvnumber0 = findViewById(R.id.tvnumber0)
        tvdot = findViewById(R.id.tvdot)
        tvequal = findViewById(R.id.tvequal)

        tvsin.setOnClickListener {
            tvmain.text = ("""
                    """ + tvmain.text.toString() + "sin" + """
                    """).trimIndent()
        }
        tvcos.setOnClickListener {
            tvmain.text = ("""
                    """ + tvmain.text.toString() + "cos" + """
                    """).trimIndent()
        }
        tvtan.setOnClickListener {
            tvmain.text = ("""
                    """ + tvmain.text.toString() + "tan" + """
                    """).trimIndent()
        }
        tvelevate.setOnClickListener {
            tvmain.text = ("""
                    """ + tvmain.text.toString() + "x^y" + """
                    """).trimIndent()
        }
        tvlg.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvlg.text.toString() + "" + """
                    """).trimIndent()
        }
        tvLparentheses.setOnClickListener {
            tvmain.text = ("""
                    """ + tvmain.text.toString() + ")" + """
                    """).trimIndent()
        }
        tvRparentheses.setOnClickListener {
            tvmain.text = ("""
                    """ + tvmain.text.toString() + "(" + """
                    """).trimIndent()
        }
        tvsquareroot.setOnClickListener {
            val `val` = tvmain.text.toString()
            val r = sqrt(`val`.toDouble())
            val result = r.toString()
            tvmain.text = result
            tvsecundary.text=
                    ("""
                    """ + "√$`val`" +  "\n" + "" + """
                    """).trimIndent()
        }
        tvclear.setOnClickListener {
            tvmain.text = ""
            tvsecundary.text=""
        }
        tvbackspace.setOnClickListener {
            var `val` = tvmain.text.toString()
            `val` = `val`.substring(0, `val`.length - 1)
            tvmain.text = `val`
        }
        tvpercentage.setOnClickListener {
            var `val` = tvmain.text.toString().toDouble()
            `val` /= 100
            tvmain.text = ("""
                    """ + String.format("%.2f", `val`) + "" + """
                    """).trimIndent()
            val value = `val` *100
            tvsecundary.text=
                    ("""
                    """ + "$value%" +  "\n" + "" + """
                    """).trimIndent()

        }
        tvdivision.setOnClickListener {
            val `val` = tvmain.text.toString()
            if (`val` != "") {
                tvmain.text = ("""
                    """ + `val` + tvdivision.text.toString() + "" + """
                    """).trimIndent()
            }
        }

        tvfatorial.setOnClickListener {
                val value = tvmain.text.toString().toInt()
            var i = 1
            var factorial: Long = 1
            while (i <= value) {
                factorial *= i.toLong()
                i++
            }
            tvmain.text = factorial.toString()
            tvsecundary.text=
                    ("""
                    """ + "$value!" +  "\n" + "" + """
                    """).trimIndent()
        }

        tvmultiply.setOnClickListener {
            val `val` = tvmain.text.toString()
            if (`val` != "") {
                tvmain.text = ("""
                    """ + `val` + tvmultiply.text.toString() + "" + """
                    """).trimIndent()
            }
        }

        tvfraction.setOnClickListener {
            val `val` = tvmain.text.toString()
                tvmain.text=tvmain.text.toString()
                val r = `val`.toDouble()
                tvmain.text=("""
                    """ +  1/r + "" + """
                    """).trimIndent()
            tvsecundary.text=
                    ("""
                    """ +"1/" + `val` +  "\n" + "" + """
                    """).trimIndent()
            }
        tvnumber0.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber0.text + """
                    """).trimIndent()
        }
        tvnumber.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber.text.toString() + """
                    """).trimIndent()
        }
        tvnumber2.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber2.text.toString() + """
                    """).trimIndent()

        }
        tvnumber3.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber3.text.toString() + """
                    """).trimIndent()
        }
        tvnumber4.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber4.text.toString() + """
                    """).trimIndent()
        }
        tvnumber5.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber5.text.toString() + """
                    """).trimIndent()
        }
        tvnumber6.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber6.text.toString() + """
                    """).trimIndent()
        }
        tvnumber7.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber7.text.toString() + "" + """
                    """).trimIndent()
        }

        tvnumber8.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber8.text.toString() + "" + """
                    """).trimIndent()
        }
        tvnumber9.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvnumber9.text.toString() + "" + """
                    """).trimIndent()
        }
        tvminus.setOnClickListener {
            val `val` = tvmain.text.toString()
            val last = `val`[`val`.length - 1]
            if (last != '-') {
                tvmain.text = ("""
                    """ + `val` + tvminus.text.toString() + """
                    """).trimIndent()
            }
        }

        tvpi.setOnClickListener {
            val `val` = tvmain.text.toString()
            val r = 3.1415 *(`val`.toDouble())
            val result = r.toString()
            tvmain.text = result
            tvsecundary.text=
                    ("""
                    """ + `val` + "*π"+ "\n" + "" + """
                    """).trimIndent()

        }

        tvplus.setOnClickListener {
            val `val` = tvmain.text.toString()
            if (`val` != "") {
                tvmain.text = ("""
                    """ + `val` + tvplus.text.toString() + """
                    """).trimIndent()
            }
        }

        tvdot.setOnClickListener {
            val `val` = tvmain.text.toString()
            tvmain.text = ("""
                    """ + `val` + tvdot.text + """
                    """).trimIndent()
        }
        tvequal.setOnClickListener {
            if (tvmain.text.toString().contains("x^y")) {
                val expression = tvmain.text.toString()
                val aux = expression.replace("x^y", "Elevate")
                val array = aux.split("Elevate".toRegex()).toTypedArray()
                val x1 = array[0].toDouble()
                val x2 = array[1].toDouble()
                tvmain.text = ("""
                    """ + x1.pow(x2).toString() + """
                    """).trimIndent()
                tvsecundary.text = ("""
                    """ + expression + "\n" + "\n").trimIndent()
            } else if (tvmain.text.toString().contains("lg")) {
                val expression = tvmain.text.toString()
                val array = expression.split("lg".toRegex()).toTypedArray()
                if (array[0].isEmpty()) {
                    val aux = array[1].toDouble()
                    tvmain.text =
                            ("""
                    """ + log10(aux).toString() + """
                    """).trimIndent()
                    tvsecundary.text = ("""
                    """ + expression + "\n" + "\n").trimIndent()
                } else {
                    val aux = array[0].toDouble()
                    tvmain.text = ("""
                    """ + log10(aux).toString() + """
                    """).trimIndent()
                    tvsecundary.text = ("""
                    """ + expression + "\n" + "\n").trimIndent()
                }
            }
            else {
                val `val` = tvmain.text.toString()
                val replacedString = `val`.replace('÷', '/').replace('×', '*')
                val result: Double = Eval.eval(replacedString)
               val r = result.toString()
               tvmain.text = ("""
                    """ + r + """
                    """).trimIndent()
                tvsecundary.text = ("""
                    """ + tvsecundary.text.toString() + `val` + "\n" + "\n").trimIndent()
           }
        }

        tvIn.setOnClickListener {
            val `val` = tvmain.text.toString()
            val r = ln(`val`.toDouble())
            val result = r.toString()
            tvmain.text = result
            }
        }
    }




