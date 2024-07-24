package com.example.jobintentservice

import android.content.Context
import android.content.Intent
import androidx.core.app.JobIntentService

class MyJobIntentService:JobIntentService() {


    companion object{
        const val JOB_ID = 100
        fun enqueueWork(context: Context,work:Intent){
            enqueueWork(context,MyJobIntentService::class.java, JOB_ID,work)
        }
    }


    override fun onHandleWork(intent: Intent) {
        Thread.sleep(10000)
        println("Job Intent Service Finished: ${Thread.currentThread().name}")
    }
}