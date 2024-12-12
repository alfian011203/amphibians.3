package com.example.amphibians.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Data class that defines an amphibian which includes a name, type, description, and image URL.
 */
@Serializable
data class Amphibian(
    val name: String, // Nama amfibi
    val type: String, // Tipe amfibi (misalnya: katak, salamander)
    val description: String, // Deskripsi tentang amfibi
    @SerialName("img_src") val imgSrc: String // URL gambar yang menunjukkan amfibi
)
