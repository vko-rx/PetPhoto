package kr.hs.emirim.kjminn.petphoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var checkStart:CheckBox
    lateinit var rg:RadioGroup
    lateinit var linear:LinearLayout
    lateinit var btnDone:Button
    lateinit var imgv:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkStart = findViewById(R.id.check_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        btnDone = findViewById(R.id.btn_done)
        imgv = findViewById(R.id.imgv)
        linear.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener{compoundButton, b ->
            if(checkStart.isChecked){
                linear.visibility = View.VISIBLE
            }else{
                linear.visibility = View.INVISIBLE
            }
        }
        btnDone.setOnClickListener{
            when(rg.checkedRadioButtonId){
                R.id.radio_dog->imgv.setImageResource(R.drawable.dog)
                R.id.radio_cat->imgv.setImageResource(R.drawable.cat)
                R.id.radio_rabbit->imgv.setImageResource(R.drawable.rabbit)
                else -> Toast.makeText(applicationContext, "라디오 버튼이 선택되지 않았습니다", Toast.LENGTH_SHORT).show()

            }
        }
    }
}