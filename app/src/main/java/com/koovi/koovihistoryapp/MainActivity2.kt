package com.koovi.koovihistoryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity2 : AppCompatActivity() {

    //declare
    private lateinit var searchButton: Button
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //initialise
        searchButton = findViewById(R.id.search)
        clearButton = findViewById(R.id.clear)
        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)



        searchButton.setOnClickListener {

            //create a variable of age to get value from user
            val age = editText.text.toString().toIntOrNull()

            //if age is not null and age is in the range between
            if (age != null && age in 20..100) {

                //when age 21 display Juice WRLD  else when is .. and so on
                val historicalfigureName = when (age) {

                    21 -> "Juice WRLD, he was a music artist who died on December 8 2019."
                    25 -> "Tupac Shakur also known as 2pac who was an african american rapper that died on September 13 1996"
                    36 -> "Bob Marley who was a Jamaican singer that died on May 11 1981"
                    40 -> "Paul Walker who was a famous American actor that died on November 30 2013"
                    41 -> "Kobe Bryant, he was an American professional basketball player that died on January 26 2020"
                    45 -> "Freddie Mercury, he was a British rock singer and song writer that died on November 24 1991"
                    46 -> "John F. Kennedy who was the 35th president of the United States that was assassinated on November 22 1963"
                    48 -> "Whitney Houston, she was a famous American singer and actress that died on February 11 2012"
                    78 -> "Mahatma Ghandi who was an Indian lawyer, politician, social activist and writer that died on January 30 1948"
                    60 -> "Diego Maradona who was an Argentinian football player that died on November 25 2020"
                    62 -> "Elvis Presley, he was a famous American singer that died on August 16 1977"
                    63 -> "Robin Williams, he was an American comedian actor that died on August 11 2014"

                    else -> null
                }

                val message = if (historicalfigureName != null) "The Historical Figure's name is $historicalfigureName."
                else "No Historical Figure found with the entered age."
                textView.text = message


            }else {
                textView.text = "invalid input. Please enter a valid age between 20 and 100."
            }
        }

        clearButton.setOnClickListener {
            editText.text.clear()
            textView.text=""

        }
    }
}
