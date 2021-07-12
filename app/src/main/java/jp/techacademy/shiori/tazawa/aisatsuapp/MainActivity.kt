package jp.techacademy.shiori.tazawa.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    // ボタンをクリックしたときの処理
    override fun onClick(v: View){
        // ボタンをクリックすると、TimePickerDialogを表示する
        showTimePickerDialog()
    }

    // TimePickerDialogを表示するときの設定
    // 初期値は13:00
    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener{view, hour, minute ->
                  if (hour in 2..9) {
                      textView.text = "おはよう"
                  } else if (hour in 10..17) {
                      textView.text = "こんにちは"
                  } else{
                      textView.text ="こんばんは"
                  }
                } ,
                13,0,true)
        timePickerDialog.show()

    }
}