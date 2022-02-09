package com.anishdubey.fitnesstrainer.modelClasses

data class ResponseData(
    var success: Boolean,
    var message: String,
    var data: List<Program>
)
