package com.anyject.basecamp.controller.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

@RestController
@RequestMapping("/timer")
class TimeController {

    @GetMapping("")
    fun getTimeDashboard(): HashMap<String, String> {

        val timeMap = HashMap<String, String>()
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
        val targetTimeZoneIdList = listOf<String>("America/New_York", "Asia/Seoul", "Europe/London", "Asia/Hong_Kong", "PST")

        val curDate = Date()
        for ( timeZoneId in targetTimeZoneIdList ) {
            dateFormat.timeZone = TimeZone.getTimeZone(timeZoneId)
            timeMap.put(timeZoneId, dateFormat.format(curDate))
        }

        return timeMap
    }
    
    @GetMapping("/all")
    fun getAllWorldTime(): HashMap<String, String> {
        val allWorldTimeMap = HashMap<String, String>()
        //val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss (z Z)")
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
        //println(TimeZone.getAvailableIDs().size) // 629
        val curDate = Date()
        for ( timeZoneId in TimeZone.getAvailableIDs() ) {
            println(timeZoneId)
            dateFormat.timeZone = TimeZone.getTimeZone(timeZoneId)
            allWorldTimeMap.put(timeZoneId, dateFormat.format(curDate))
        }

        return allWorldTimeMap
    }

}