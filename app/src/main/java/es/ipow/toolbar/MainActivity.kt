package es.ipow.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ipow.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        //Establezco la toolbar como ActionBar
        setSupportActionBar(b.toolbar)

        // Display application icon in the toolbar
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setLogo(R.drawable.ic_flash_head_100)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        // "on click" operations to be performed
        b.tvContador.setOnClickListener {
            count++
            b.tvContador.text = "" + count
        }
    }
}