package com.example.hiltusage.di

import com.example.hiltusage.Adress
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideAdress() : Adress{
    return Adress("Kadikoy / Istanbul")
    }
}