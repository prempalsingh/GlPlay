package com.example.glplay

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dropbox.dropshots.Dropshots
import org.junit.Rule
import org.junit.Test

class SnapshotTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    val dropshots = Dropshots()

    @Test
    fun snapshot() {
        activityScenarioRule.scenario.onActivity {
            dropshots.assertSnapshot(it, "Snapshot")
        }
    }
}