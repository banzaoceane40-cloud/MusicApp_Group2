package za.ac.iie.musicapp_gr02

import android.util.Log

class Song {
  //adding variables for song object's attributes
    var name : String  = ""
    var artist : String = ""
    var year : Int = 0
    var duration : String = ""

    //function to play the song
    fun Play(){
        Log.v("Song", "$name is playing")

    }

    //function to pause the song
    fun Pause(){
        Log.v("Song", "$name is paused")

    }

   //function to stop the song
    fun Stop(){
       Log.v("Song", "$name is stopped")

    }

    //function o favorite a song
    fun Favorite(): Boolean{
        Log.v("Song", "$name is favorited")
        return true
    }
}