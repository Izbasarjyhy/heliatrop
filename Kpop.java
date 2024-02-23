package com.izba.music.springapp1;

public class Kpop implements Music {
    @Override
    public String getSong() {
        String[] songs = {
                "Blackpink - Kill this love",
                "StrayKids - Love me or Leave me",
                "Everglow - bon-bon chocolate",
        };
//
//        StringBuilder allSongs = new StringBuilder();
//        for (String song : songs) {
//            allSongs.append(song).append("\n");
//        }
//        return allSongs.toString();
          StringBuilder all=new StringBuilder();
          for(String song:songs){
              all.append(song).append("\n");
          }
          return all.toString();

    }
}
