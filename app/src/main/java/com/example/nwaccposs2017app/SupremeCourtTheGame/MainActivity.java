package com.example.nwaccposs2017app.SupremeCourtTheGame;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.FirebaseApp;

public class MainActivity extends SingleViewActivityFragment {

    /**
     * Private static string for the the Main Activity of the program for the Log
     */
    private static final String TAG = "MainActivity";

    /**
     * Private attribute for the tool bar for the program.
     */
    private Toolbar mToolBar;

    /**
     * Method to Create the Fragment if it's null
     *
     * @return a new {@link Fragment} for the view
     */
    @Override
    protected Fragment createFragment() {



        return new QuizFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.sign_out_menu:
                AuthUI.getInstance().signOut(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
