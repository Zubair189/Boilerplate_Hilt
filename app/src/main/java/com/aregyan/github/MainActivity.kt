package com.aregyan.github

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aregyan.github.views.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}