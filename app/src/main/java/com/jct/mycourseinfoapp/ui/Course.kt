package com.jct.mycourseinfoapp.ui


// data model for course information
data class Course(
    val id: String,     // used as a unique identifier for each course and for state stability
    val title: String,
    val code: String,
    val credits: Int,
    val description: String,
    val prerequisites: List<String> = emptyList()
) {
    fun getCredit() = "$credits Credits"  // to returns credit as a string
}
