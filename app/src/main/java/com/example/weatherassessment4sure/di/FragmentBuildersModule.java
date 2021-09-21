package com.example.weatherassessment4sure.di;


import com.example.weatherassessment4sure.ui.settings.SettingsFragment;
import com.example.weatherassessment4sure.ui.today.TodayFragment;
import com.example.weatherassessment4sure.ui.weekly.WeeklyFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract TodayFragment contributeTodayFragment();

    @ContributesAndroidInjector
    abstract WeeklyFragment contributeWeeklyFragment();

    @ContributesAndroidInjector
    abstract SettingsFragment contributeSettingsFragment();
}
