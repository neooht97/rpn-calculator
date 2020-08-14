package com.example.demo

import com.example.demo.component.diary.DiaryRepository
import com.example.demo.component.diary.DiaryService
import io.cucumber.java8.En
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.any
import org.mockito.Mockito.mock

class MyStepDef : En {
    init {
        var dateTest: String
        var nameTest: String
        var clickButton: String
        var saveButton: String

        Given("{string} clicks button {string}") { name: String, buttonName: String ->
            nameTest = name
            clickButton = buttonName
        }

        Given("choose date as {string}") { date: String ->
            dateTest = date
        }

        When("write diary {string}") { diaryText: String ->
            assertEquals(diaryText, "today is a wonder day")
        }

        Then("system display new button {string}") { buttonText: String ->
            val result = DiaryService().test()
            assertEquals(buttonText, result)
        }
    }
}
