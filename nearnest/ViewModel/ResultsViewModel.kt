package com.example.nearnest.ViewModel

import androidx.lifecycle.LiveData
import com.example.nearnest.Domain.CategoryModel
import com.example.nearnest.Domain.StoreModel
import com.example.nearnest.Repository.ResultsRepository

class ResultsViewModel {
    private val repository = ResultsRepository()
    fun loadSubCategory(id:String): LiveData<MutableList<CategoryModel>>{
        return  repository.loadSubCategory(id)
    }
    fun loadPopular(id:String): LiveData<MutableList<StoreModel>>{
        return  repository.loadPopular(id)
    }
    fun loadNearest(id:String): LiveData<MutableList<StoreModel>>{
        return  repository.loadNearest(id)
    }
}