package com.example.nearnest.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.nearnest.Domain.BannerModel
import com.example.nearnest.Domain.CategoryModel
import com.example.nearnest.Repository.DashboardRepository

class DashboardViewModel : ViewModel() {
    private val repository = DashboardRepository()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadBanner(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()
    }
}