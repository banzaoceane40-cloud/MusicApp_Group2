package za.ac.iie.musicapp_gr02

import android.util.Log

class Song (songName: String, songArtist: String, songYear: Int,songDuration: String){

    //adding variables for song object's attributes
    var name : String  = ""
    var artist : String = ""
    var year : Int = 0
    var duration : String = ""

    //added secondary constructor, if user only have name and artist
    constructor(songName: String,songArtist: String): this(songName,songArtist,0,"")

    //secondary constructor accomodating users who don't know the artist and the year
    constructor(songName: String, songDuration: String, songYear: Int): this(songName,"",0,songDuration)

    //initializing the variables/attributes for the song objects
    init{
       name = songName
       artist = songArtist
       year = songYear
       duration = songDuration
    }

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

    //function to favorite a song
    fun Favorite(): Boolean{
        Log.v("Song", "$name is favorited")
        return true
    }
   //added function to display song attributes
    fun DisplaySongs(): String{
        return "$name - $artist ($duration)"
    }
}