package com.example.liyai.kotlin_intro

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intent", "Android Programing with Intent")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programing with Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language ", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var noteInfo = NoteInfo(CourseInfo("android_intent", "Android Programing with Intent"),
                "Android Intent",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus hendrerit in neque eu facilisis")
        notes.add(noteInfo)

        noteInfo = NoteInfo(CourseInfo("android_async", "Android Async Programing with Services"),
                "Android Async",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus hendrerit in neque eu facilisis")
        notes.add(noteInfo)

        noteInfo = NoteInfo(CourseInfo("java_lang", "Java Fundamentals: The Java Language "),
                "Java Fundamentals",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus hendrerit in neque eu facilisis")
        notes.add(noteInfo)

        noteInfo = NoteInfo(CourseInfo("java_core", "Java Fundamentals: The Core Platform "),
                "Java Core",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus hendrerit in neque eu facilisis")
        notes.add(noteInfo)
        noteInfo = NoteInfo(CourseInfo("java_core", "Java Fundamentals: The Core Platform "),
                "Core Deep dive",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus hendrerit in neque eu facilisis")
        notes.add(noteInfo)

        noteInfo = NoteInfo(CourseInfo("android_async", "Android Async Programing with Services"),
                "Android Async 2",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus hendrerit in neque eu facilisis")
        notes.add(noteInfo)

        noteInfo = NoteInfo(CourseInfo("android_async", "Android Async Programing with Services"),
                "Android Async 3",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus hendrerit in neque eu facilisis")
        notes.add(noteInfo)
    }
}