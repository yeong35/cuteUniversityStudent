package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초 실행 됐을때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // xml 화면 뷰를 연결
        
        tv_title.setText("귀여운 대학생 인증서")       //텍스트의 값을 변경
        tv_body.setText("귀하는 귀여운 대학생으로 공식적으로 인증되었으며 귀엽기 때문에 다른 이들보다 더 소중합니다.")
        tv_bottom.setText("국제 귀여운 대학생 협회")
    }
}