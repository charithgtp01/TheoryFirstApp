package info.charith.theoryfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    var TAG = SecondActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "$TAG:onCreate")



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