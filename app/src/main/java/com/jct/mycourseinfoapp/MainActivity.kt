package com.jct.mycourseinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jct.mycourseinfoapp.ui.CourseListScreen
import com.jct.mycourseinfoapp.ui.theme.MyCourseInfoAppTheme
import com.jct.mycourseinfoapp.ui.MyCourses

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyCourseInfoAppTheme {

                CourseListScreen(courses = MyCourses)

            }
        }
    }
}

