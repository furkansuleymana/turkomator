package com.fuka.turkomator.model


import com.google.gson.annotations.SerializedName

data class Atasozu(
    @SerializedName("madde")
    val madde: String?,
    @SerializedName("madde_id")
    val maddeId: String?,
    @SerializedName("on_taki")
    val onTaki: Any?
)