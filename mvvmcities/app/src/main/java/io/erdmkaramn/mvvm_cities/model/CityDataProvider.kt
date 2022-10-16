package io.erdmkaramn.mvvm_cities.model

import io.erdmkaramn.mvvm_cities.R

class CityDataProvider {
    private val cities= arrayListOf<City>()

    init {
        cities.add(City("Ankara", R.drawable.ankara,5_500_000))
        cities.add(City("Kars", R.drawable.kars,500_000))
        cities.add(City("Iğdır", R.drawable.igdir,230_000))
        cities.add(City("Mardin", R.drawable.mardin,1_000_000))
        cities.add(City("Trabzon", R.drawable.trabzon,750_000))
        cities.add(City("Van", R.drawable.van,900_000))
        cities.add(City("İzmir", R.drawable.izmircoast,3_000_000))
        cities.add(City("Antalya", R.drawable.antalya,2_500_000))

    }

    fun getCities()=cities
}