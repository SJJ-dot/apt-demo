package com.apt.sjj.apt_demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.apt.sjj.api.TestAnn
import com.apt.sjj.api.TestAnn2
import com.example.helloworld.HelloWorld

class MainActivity : AppCompatActivity() {

    @TestAnn
    var aa = "aaaaaaaaaaaa"
    @TestAnn2
    var aa2 = "aaaaaaaaaaaa"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HelloWorld.main(arrayOf("aaaaaaaaaaaaaaaaaa"))
    }
}
