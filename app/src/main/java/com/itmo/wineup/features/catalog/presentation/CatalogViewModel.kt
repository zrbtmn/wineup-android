package com.itmo.wineup.features.catalog.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.itmo.wineup.features.catalog.domain.GetWineListUseCase
import com.itmo.wineup.features.catalog.models.WineColor
import com.itmo.wineup.features.catalog.models.WineModel

class CatalogViewModel: ViewModel() {

    private val getWineListUseCase = GetWineListUseCase()

    val wineList = MutableLiveData<List<WineModel>>()

    val wineColorList = MutableLiveData<WineColor>()

    fun setWines() {
        wineList.value = getWineListUseCase.invoke()
    }

}