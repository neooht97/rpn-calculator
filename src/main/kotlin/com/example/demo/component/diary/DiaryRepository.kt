package com.example.demo.component.diary

import org.springframework.data.mongodb.repository.MongoRepository

interface DiaryRepository : MongoRepository<DiaryProjection, Int>
