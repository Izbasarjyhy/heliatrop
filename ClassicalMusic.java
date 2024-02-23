package com.izba.music.springapp1;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        String[] songs = {
                "Мейрамбек Беспаев - Алғашқы махаббат",
                "Халық аузында - Ана туралы терме",
                "Нурболат Абдуллин - Вальс",

        };
        int randomIndex = (int) (Math.random() * songs.length);
        return songs[randomIndex];
    }
}