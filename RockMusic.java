package com.izba.music.springapp1;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        String[] songs = {
                "Nirvana - Smells Like Teen Spirit",
                "AC/DC - Back in Black",
                "Led Zeppelin - Stairway to Heaven",

        };

        int randomIndex = (int) (Math.random() * songs.length);
        return songs[randomIndex];
    }
}


