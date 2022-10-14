package com.anyject.basecamp.service

interface Formatter {
    fun reFormat():String
    fun reFormatToHtml():String = ""
}