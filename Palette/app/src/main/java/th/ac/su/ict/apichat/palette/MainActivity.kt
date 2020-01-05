package th.ac.su.ict.apichat.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)

        var colorBox = findViewById<TextView>(R.id.colorBox)
        //var textBox = findViewById<TextView>(R.id.textBox)
        var bt1 = findViewById<Button>(R.id.bt1)
        var bt2 = findViewById<Button>(R.id.bt2)
        var bt3 = findViewById<Button>(R.id.bt3)
        var bt4 = findViewById<Button>(R.id.bt4)
        var bt5 = findViewById<Button>(R.id.bt5)
        var bt6 = findViewById<Button>(R.id.bt6)

        bt1.setOnClickListener(){
            colorBox.setText("235-255-221")
            colorBox.setBackgroundColor(Color.parseColor("#ebe1dd"))
        }
        bt2.setOnClickListener(){
            colorBox.setText("236-203-202")
            colorBox.setBackgroundColor(Color.parseColor("#eccbca"))
        }
        bt3.setOnClickListener(){
            colorBox.setText("117-131-156")
            colorBox.setBackgroundColor(Color.parseColor("#75839c"))
        }
        bt4.setOnClickListener(){
            colorBox.setText("153-169-191")
            colorBox.setBackgroundColor(Color.parseColor("#99a9bf"))
        }
        bt5.setOnClickListener(){
            colorBox.setText("195-204-216")
            colorBox.setBackgroundColor(Color.parseColor("#c3ccd8"))
        }
        bt6.setOnClickListener(){
            colorBox.setText("221-226-269")
            colorBox.setBackgroundColor(Color.parseColor("#dee2e5"))
        }

    }
}
