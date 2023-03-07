package com.example.family

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.family.databinding.MainActivityBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomBar.setOnItemSelectedListener {
            if(it.itemId==R.id.navGuard){
                inflateFragment(GuardFragment())
            }else if(it.itemId==R.id.navHome){
                inflateHomeFragment(HomeFragment())

            }
            else if(it.itemId==R.id.navdashboard){
                inflateDashboardFragment(DashboardFragment())

            }
            else if(it.itemId==R.id.navProfile)
            {
                inflateProfileFragment(ProfileFragment())
            }
            true

        }
        }

    private fun inflateProfileFragment(newInstance:ProfileFragment) {
        var transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.FrameContainer ,newInstance)
        transaction.commit()
    }

    private fun inflateDashboardFragment(newInstance: DashboardFragment) {
        var transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.FrameContainer ,newInstance)
        transaction.commit()
    }

    private fun inflateHomeFragment(newInstance: HomeFragment) {
        var transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.FrameContainer ,newInstance)
        transaction.commit()
    }

    private fun inflateFragment(newInstance: GuardFragment) {
        var transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.FrameContainer,newInstance)
        transaction.commit()

    }
}


