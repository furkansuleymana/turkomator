package com.fuka.turkomator.model


import com.google.gson.annotations.SerializedName

data class OzelliklerListe(
    @SerializedName("ekno")
    val ekno: String?,
    @SerializedName("kisa_adi")
    val kisaAdi: String?,
    @SerializedName("ozellik_id")
    val ozellikId: String?,
    @SerializedName("tam_adi")
    val tamAdi: String?,
    @SerializedName("tur")
    val tur: String?
)