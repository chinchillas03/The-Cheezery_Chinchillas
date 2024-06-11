package chinchillas.diego.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnColdDrinks : Button = findViewById(R.id.button_cold_drinks)
        var btnHotDrinks : Button = findViewById(R.id.button_hot_drinks)
        var btnSweet : Button = findViewById(R.id.button_sweets)
        var btnSalties : Button = findViewById(R.id.button_salties)


        btnColdDrinks.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btnHotDrinks.setOnClickListener{
            var intent: Intent = Intent(this, HotProductsActivity::class.java)
            startActivity(intent)
        }

        btnSweet.setOnClickListener{
            var intent: Intent = Intent(this, SweetProducts::class.java)
            startActivity(intent)
        }

        btnSalties.setOnClickListener{
            var intent: Intent = Intent(this, SaltiesProducts::class.java)
            startActivity(intent)
        }

    }
}