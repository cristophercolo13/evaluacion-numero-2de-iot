package com.example.mygarage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        //llamar a garage
                        garage g = new garage();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,g).commit();

                        break;

                    case 1:
                        //llamar a temperatura
                        temperatura t= new temperatura();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,t).commit();

                        break;

                    case 2:
                        //llamar a luz
                        luz l = new luz();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,l).commit();

                        break;

                    case 3:
                        //llamar a informacion
                        informacion i = new informacion();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,i).commit();

                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}