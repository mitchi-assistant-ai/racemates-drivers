package com.racemates.driverdb
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collection = "drivers")
data class Driver(
    @Id val id: String? = null,
    val name: String,
    val nationality: String,
    val team: String,
    val dateOfBirth: Instant? = null,
    val series: String,
    val points: Int?,
    val status: String,
    val imageUrl: String? = null
)
