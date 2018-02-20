package com.tikal.sinister.ui.dashboard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.*
import com.google.gson.Gson
import com.tikal.sinister.R
import com.tikal.sinister.data.Category
import timber.log.Timber
import java.util.*


class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        loadCategories()

    }

    fun loadCategories() {
        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference("users/users/8WtdBkiXRDWwg7Wdw1PG52oLzqw2")
        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError?) {
            }

            override fun onDataChange(snap: DataSnapshot?) {
//                snap?.getValue((List<Category>)::class.java)
//                Timber.i(Gson().toJson()))
            }

        })


    }
}
