package com.fuka.turkomator.model


import com.google.gson.annotations.SerializedName

data class WordItem(
    @SerializedName("anlam_gor")
    val anlamGor: String?,
    @SerializedName("anlam_say")
    val anlamSay: String?,
    @SerializedName("anlamlarListe")
    val anlamlarListe: List<AnlamlarListe>?,
    @SerializedName("atasozu")
    val atasozu: List<Atasozu>?,
    @SerializedName("birlesikler")
    val birlesikler: String?,
    @SerializedName("cesit")
    val cesit: String?,
    @SerializedName("cesit_say")
    val cesitSay: String?,
    @SerializedName("cogul_mu")
    val cogulMu: String?,
    @SerializedName("font")
    val font: Any?,
    @SerializedName("gosterim_tarihi")
    val gosterimTarihi: Any?,
    @SerializedName("kac")
    val kac: String?,
    @SerializedName("kelime_no")
    val kelimeNo: String?,
    @SerializedName("lisan")
    val lisan: String?,
    @SerializedName("lisan_kodu")
    val lisanKodu: String?,
    @SerializedName("madde")
    val madde: String?,
    @SerializedName("madde_duz")
    val maddeDuz: String?,
    @SerializedName("madde_id")
    val maddeId: String?,
    @SerializedName("on_taki")
    val onTaki: Any?,
    @SerializedName("ozel_mi")
    val ozelMi: String?,
    @SerializedName("taki")
    val taki: Any?,
    @SerializedName("telaffuz")
    val telaffuz: Any?
)