package com.jct.mycourseinfoapp.ui

val MyCourses = listOf(
    Course(
        id = "CS101",
        title = "Introduction to Cyber Security",
        code = "CYBER-101",
        credits = 3,
        description = "Fundamentals of cyber security including threats, vulnerabilities, and defense mechanisms. Covers encryption, network security, and ethical hacking basics.",
        prerequisites = listOf("NET-101", "OS-101")
    ),
    Course(
        id = "MA202",
        title = "Mobile App Development with Kotlin",
        code = "MOBILE-202",
        credits = 4,
        description = "Build native Android apps using Kotlin and Jetpack Compose. Learn modern UI development, state management, and integration with backend services.",
        prerequisites = listOf("PROG-101", "AND-101")
    ),
    Course(
        id = "AI301",
        title = "Artificial Intelligence Fundamentals",
        code = "AI-301",
        credits = 4,
        description = "Introduction to AI concepts including machine learning, neural networks, and natural language processing. Hands-on projects with TensorFlow.",
        prerequisites = listOf("MATH-201", "PROG-202")
    ),
    Course(
        id = "CG205",
        title = "Computer Graphics and Visualization",
        code = "GRAPHICS-205",
        credits = 3,
        description = "Principles of 2D/3D graphics rendering, OpenGL basics, and UI/UX visualization techniques. Includes practical projects with modern graphics libraries.",
        prerequisites = listOf("MATH-102", "PROG-101")
    ),
    Course(
        id = "OS201",
        title = "Operating Systems Concepts",
        code = "OS-201",
        credits = 4,
        description = "In-depth study of operating system components: process management, memory systems, file systems, and concurrency. Practical exercises with Linux kernel modules.",
        prerequisites = listOf("PROG-202", "ARCH-101")
    ),
    Course(
        id = "DB304",
        title = "Advanced Database Systems",
        code = "DB-304",
        credits = 4,
        description = "Advanced topics in database management including NoSQL, distributed databases, and query optimization. Hands-on experience with MongoDB and PostgreSQL.",
        prerequisites = listOf("DB-101", "ALG-201")
    ),
    Course(
        id = "CL401",
        title = "Cloud Computing Architecture",
        code = "CLOUD-401",
        credits = 3,
        description = "Design and implementation of cloud-based systems using AWS and Azure. Covers microservices, serverless architecture, and containerization with Docker/Kubernetes.",
        prerequisites = listOf("NET-201", "OS-201")
    ),
    Course(
        id = "DS205",
        title = "Data Structures and Algorithms",
        code = "DSA-205",
        credits = 4,
        description = "Fundamental data structures (trees, graphs, hash tables) and algorithms (sorting, searching, pathfinding). Complexity analysis and practical implementation.",
        prerequisites = listOf("PROG-101", "MATH-101")
    ),
    Course(
        id = "UX103",
        title = "User Experience Design",
        code = "UX-103",
        credits = 3,
        description = "Principles of human-centered design, usability testing, and interactive prototyping. Covers wireframing tools and accessibility standards.",
        prerequisites = listOf("DESIGN-101")
    )
)