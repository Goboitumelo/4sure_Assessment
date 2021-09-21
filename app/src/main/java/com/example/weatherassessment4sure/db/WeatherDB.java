package com.example.weatherassessment4sure.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.weatherassessment4sure.model.SavedDailyForecast;
import com.example.weatherassessment4sure.model.UviDb;


@Database(entities = {SavedDailyForecast.class, UviDb.class},
        version = 1,
        exportSchema = false)

public abstract class WeatherDB extends RoomDatabase {
    abstract public ForecastDao forecastDao();
}
