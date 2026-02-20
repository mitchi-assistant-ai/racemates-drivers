package com.racemates.driverdb
import org.springframework.web.bind.annotation.*
import org.springframework.data.domain.PageRequest
import io.swagger.v3.oas.annotations.Operation

@RestController
@RequestMapping("/api/v1/drivers")
class DriverController(private val repository: DriverRepository) {
    @GetMapping
    @Operation(summary = "Get all drivers with paging")
    fun getAll(@RequestParam(defaultValue = "0") page: Int, @RequestParam(defaultValue = "10") size: Int) =
        repository.findAll(PageRequest.of(page, size))
}
