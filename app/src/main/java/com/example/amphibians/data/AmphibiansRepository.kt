package com.example.amphibians.data

import com.example.amphibians.model.Amphibian
import com.example.amphibians.network.AmphibiansApiService

/**
 * Repository mengambil data amfibi dari sumber data yang mendasari.
 */
interface AmphibiansRepository {
    /** Mengambil daftar amfibi dari sumber data yang mendasari */
    suspend fun getAmphibians(): List<Amphibian>
}

/**
 * Implementasi jaringan dari repository yang mengambil data amfibi dari sumber data yang mendasari.
 */
class DefaultAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepository {
    /** Mengambil daftar amfibi dari sumber data yang mendasari */
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}
