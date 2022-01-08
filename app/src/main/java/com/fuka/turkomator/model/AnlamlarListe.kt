package com.fuka.turkomator.model


import com.google.gson.annotations.SerializedName

data class AnlamlarListe(
    @SerializedName("anlam")
    val anlam: String?,
    @SerializedName("anlam_id")
    val anlamId: String?,
    @SerializedName("anlam_sira")
    val anlamSira: String?,
    @SerializedName("fiil")
    val fiil: String?,
    @SerializedName("gos")
    val gos: String?,
    @SerializedName("madde_id")
    val maddeId: String?,
    @SerializedName("ozelliklerListe")
    val ozelliklerListe: List<OzelliklerListe>?,
    @SerializedName("tipkes")
    val tipkes: String?
)