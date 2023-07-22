package com.example.kotlin_jetpack.models

import com.example.kotlin_jetpack.R

class ScientistModel(name: String, image: Int) {
    var name: String? = name
    var image: Int? = image


    companion object {
        public var listOfScientist = listOf<ScientistModel>(
            ScientistModel("Albert", R.drawable.einstein),
            ScientistModel("Suck", R.drawable.zuck),
            ScientistModel("Ilon Mask", R.drawable.ilon),
            ScientistModel("Albert", R.drawable.einstein),
            ScientistModel("Zuck", R.drawable.zuck),
            ScientistModel("Ilon Mask", R.drawable.ilon)
        );
    }
}