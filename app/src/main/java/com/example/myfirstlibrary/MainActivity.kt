
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.analyticsdemo.ToasterDemo
import com.example.myfirstlibrary.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ToasterDemo
        setContentView(R.layout.activity_main)
    }
}