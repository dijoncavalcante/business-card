package com.dijon.businesscard.ui

import android.app.Application
import com.dijon.businesscard.data.AppDataBase
import com.dijon.businesscard.data.BusinessCardRepository

class App : Application(){
    val dataBase by lazy { AppDataBase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(dataBase.businessDao())}
}