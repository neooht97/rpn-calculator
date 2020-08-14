//package com.example.demo.component.controller
//
//import com.example.demo.component.diary.DiaryProjection
//import com.example.demo.component.diary.DiaryService
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.PathVariable
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RestController
//
//@RestController
//class DiaryController @Autowired internal constructor(
//    val diaryService: DiaryService
//) {
//
//    @GetMapping(
//        "test"
//    )
//    fun sampleData(): List<DiaryProjection> {
//        val sampleDiary = DiaryProjection(
//            id = 1,
//            header = "test"
//        )
//
//        return diaryService.getSampleData()
//    }
//
//    @PostMapping(
//        "test/{id}/{header}"
//    )
//    fun createDiaryEntry(
//        @PathVariable("id") id: Int,
//        @PathVariable("header") header: String
//    ): DiaryProjection {
//        return diaryService.createDiaryEntry(id, header)
//    }
//}
