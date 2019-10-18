package com.example.foryoudicodingsubmissionfour.roomdb;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Favorite_TvShow {

    @PrimaryKey(autoGenerate = true)
    private long note_id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "backdrop_path")
    public String backdrop_path;

    @ColumnInfo(name = "vote_average")
    public String vote_average;

    @ColumnInfo(name = "vote_count")
    public String vote_count;

    @ColumnInfo(name = "first_air_date")
    public String first_air_date;

    @ColumnInfo(name = "poster_path")
    public String poster_path;

    @ColumnInfo(name = "original_language")
    public String original_language;

    @ColumnInfo(name = "popularity")
    public String popularity;

    @ColumnInfo(name = "overview")
    public String overview;

    public long getNote_id() {
        return note_id;
    }

    public void setNote_id(long note_id) {
        this.note_id = note_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public String getVote_count() {
        return vote_count;
    }

    public void setVote_count(String vote_count) {
        this.vote_count = vote_count;
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
