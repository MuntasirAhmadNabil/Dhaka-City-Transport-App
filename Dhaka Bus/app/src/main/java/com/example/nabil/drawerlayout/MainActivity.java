package com.example.nabil.drawerlayout;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private long backPressedTime;
    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mToggle;
   // private EditText sourceET;
    //private EditText destinationET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent= getIntent();

        NavigationView navigationView= (NavigationView) findViewById(R.id.nvdrawer);

        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flcontent,new HomeFragment());
        fragmentTransaction.commit();
        navigationView.setCheckedItem(R.id.home);


        mdrawerlayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mdrawerlayout, R.string.open, R.string.close);
        mdrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
      //  NavigationView navigationView= (NavigationView) findViewById(R.id.nvdrawer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(navigationView);



    }

    @Override
    public void onBackPressed() {


        if(backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void selectItemDrawer(MenuItem menuItem) {
         /*  switch (menuItem.getItemId()){
               case R.id.home:
                   Intent intent= new Intent(this,HomeActivity.class);
                   startActivity(intent);
                   finish();
           }*/
        android.support.v4.app.Fragment myFragment = null;
        Class fragmentClass=null;
        switch (menuItem.getItemId()) {

            case R.id.home:
                fragmentClass=HomeFragment.class;
                break;
            case R.id.allbus:
                fragmentClass= AllBusFragment.class;
                break;
            case R.id.rateapp:
                fragmentClass = RateAppFragment.class;
                break;
            case R.id.about:
                fragmentClass = AboutFragment.class;
                break;
            case R.id.help:
                fragmentClass = HelpFragment.class;
                break;
           // default:
          //      fragmentClass = HomeFragment.class;
        }

        try {
            myFragment= (android.support.v4.app.Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flcontent,myFragment).commit();
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        mdrawerlayout.closeDrawers();


    }

    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectItemDrawer(item);
                return true;
            }
        });
    }


 /*   public void hidekeyboard(View view) {
        InputMethodManager inputMethodManager= (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }*/
}