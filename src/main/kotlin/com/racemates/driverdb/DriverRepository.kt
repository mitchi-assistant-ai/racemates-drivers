package com.racemates.driverdb
import org.springframework.data.mongodb.repository.MongoRepository
interface DriverRepository : MongoRepository<Driver, String>
