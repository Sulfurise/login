package com.example.myapplication.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Keep
@Parcelize
data class Data(
    @SerializedName("createdAt")
    val createdAt: String? = "",
    @SerializedName("email")
    val email: String? = "",
    @SerializedName("_id")
    val id: String? = "",
    @SerializedName("ktp")
    val ktp: String? = "",
    @SerializedName("nohp")
    val nohp: String? = "",
    @SerializedName("password")
    val password: String? = "",
    @SerializedName("tgllahir")
    val tgllahir: String? = "",
    @SerializedName("updatedAt")
    val updatedAt: String? = "",
    @SerializedName("username")
    val username: String? = "",
    @SerializedName("__v")
    val v: Int? = 0
) : Parcelable