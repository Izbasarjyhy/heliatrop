package com.izba.music.springapp1;

public class EasternMusic implements Music {
    @Override
    public String getSong() {
        String[] songs = {
                "AZIS - Sen trope",
                "INEZ - My love",
                "Amr Diab - Osad Einy",
        };
        int randomIndex = (int) (Math.random() * songs.length);
        return songs[randomIndex];
    }
}