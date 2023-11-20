package com.comp.lab4_sebastiansilva.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity
data class Test(
    @PrimaryKey val testId: Int,
    @ColumnInfo(name = "patientId") val patientId: Int,
    @ColumnInfo(name = "nurseId") val nurseId: Int,
    @ColumnInfo(name = "BPL") val bpl: Float,
    @ColumnInfo(name = "BPH") val bph: Float,
    @ColumnInfo(name = "temperature") val temperature: Float
)
