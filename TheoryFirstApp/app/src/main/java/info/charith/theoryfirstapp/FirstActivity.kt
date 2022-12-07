package info.charith.theoryfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    var TAG = FirstActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "$TAG:onCreate")

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        Runnable { println() }

        var runnable = (Runnable { println() })
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$TAG:onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$TAG:onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$TAG:onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$TAG:onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$TAG:onDestroy")
    }

}