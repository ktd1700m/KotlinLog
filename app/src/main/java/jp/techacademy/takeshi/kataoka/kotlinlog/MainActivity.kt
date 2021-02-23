package jp.techacademy.takeshi.kataoka.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Humanクラスのインスタンスを2つ作成
        val human1 = Human("石橋", 40, "赤切り立直")
        val human2 = Human("朝倉", 34, "雀魂")

        // human1のsayメソッドとthinkメソッド呼び出し
        human1.say()
        human1.think()

        // human2のsayメソッドとthinkメソッド呼び出し
        human2.say()
        human2.think()

    }
}