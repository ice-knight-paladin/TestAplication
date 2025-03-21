package com.example.testaplacation.models

data class CourseResponse(
    val courses: List<Course>
)

data class Course(
    val id: Int,
    val title: String,
    val text: String,
    val price: String,
    val rate: String,
    val startDate: String,
    val hasLike: Boolean,
    val publishDate: String
)