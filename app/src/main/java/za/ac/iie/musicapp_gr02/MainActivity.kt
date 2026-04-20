package za.ac.iie.musicapp_gr02

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val songDisplayTxt = findViewById<TextView>(R.id.songDisplay)
        var songDisplay = ""

        var song1 = Song("Ordinary", "Alex Warren", 2026, "2.5")
        var song2= Song("Swim", "BTS", 2026, "3.5")
        var song3= Song("So Easy", "Olivia Dean")
        var song4= Song("Unstoppable", "3;37",1)
        var song5=
        //creating array to hold songs
        var songs = arrayOf<Song>(song1, song2, song3)

        //for loop to loop through and display items to song array
        for (song in songs){
            songDisplay += "${song.DisplaySongs()}\n\n"
        }

        songDisplayTxt.text = songDisplay


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}