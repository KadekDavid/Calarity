package org.d3if0126.myapplication.ui.home

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import org.d3if0126.myapplication.R
import org.d3if0126.myapplication.databinding.ActivityHomeBinding
import org.d3if0126.myapplication.ui.profile.ProfileActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // bottom menu on click
        binding.floatingActionButton.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    true
                }

                R.id.account -> {
                    startActivity(Intent(this@HomeActivity, ProfileActivity::class.java))
                    true
                }

                else -> false
            }
        }
    }
}
