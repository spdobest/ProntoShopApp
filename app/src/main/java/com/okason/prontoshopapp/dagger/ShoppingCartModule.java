package com.okason.prontoshopapp.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.okason.prontoshopapp.ShoppingCart;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Valentine on 4/20/2016.
 */
@Module
public class ShoppingCartModule {

    @Provides
    @Singleton
    SharedPreferences providesSharedPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides @Singleton
    ShoppingCart providesShoppingCart(SharedPreferences preferences){
        return  new ShoppingCart(preferences);
    }


}

