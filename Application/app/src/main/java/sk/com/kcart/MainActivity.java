package sk.com.kcart;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import Fragment.GenralFragment;
import ListViewAdapter.ListViewAdapter;

public class MainActivity extends AppCompatActivity {
    Context cxt = this;
    private Toolbar mtoolbar;
    private DrawerLayout mdrawerLayout;
    private NavigationView mnavigationview;
    private ListView mlistView;
    private ListViewAdapter madapter;
    FragmentManager mfm;
    FragmentTransaction mft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mfm = getSupportFragmentManager();
        mft= mfm.beginTransaction();
        mft.add(R.id.continer, new GenralFragment("bike"));
        mft.commit();

        mnavigationview = (NavigationView) findViewById(R.id.navigation_view);
        mnavigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);


                mdrawerLayout.closeDrawers();
                String tittle = (String) item.getTitle();
                switch (tittle.toLowerCase()) {
                    case "bike":
                        mfm = getSupportFragmentManager();
                        mft = mfm.beginTransaction();
                        mft.replace(R.id.continer, new GenralFragment(tittle));
                        mft.commit();
                        mtoolbar.setTitle(tittle.toUpperCase());
                        Snackbar.make(findViewById(R.id.drawer), item.getTitle(), Snackbar.LENGTH_LONG).show();
                        break;
                    case "car":
                        mfm = getSupportFragmentManager();
                        mft= mfm.beginTransaction();
                        mft.replace(R.id.continer, new GenralFragment(tittle));
                        mft.commit();
                        mtoolbar.setTitle(tittle.toUpperCase());
                        Snackbar.make(findViewById(R.id.drawer), item.getTitle(), Snackbar.LENGTH_LONG).show();
                        break;
                    case "dress":
                        mtoolbar.setTitle(tittle.toUpperCase());
                        Snackbar.make(findViewById(R.id.drawer), item.getTitle(), Snackbar.LENGTH_LONG).show();
                        mfm = getSupportFragmentManager();
                        mft= mfm.beginTransaction();
                        mft.replace(R.id.continer, new GenralFragment(tittle));
                        mft.commit();
                        break;
                    case "fruit":
                        mtoolbar.setTitle(tittle.toUpperCase());
                        Snackbar.make(findViewById(R.id.drawer), item.getTitle(), Snackbar.LENGTH_LONG).show();
                        mfm = getSupportFragmentManager();
                        mft= mfm.beginTransaction();
                        mft.replace(R.id.continer, new GenralFragment(tittle));
                        mft.commit();
                        break;
                    case "mobile":
                        mtoolbar.setTitle(tittle.toUpperCase());
                        Snackbar.make(findViewById(R.id.drawer), item.getTitle(), Snackbar.LENGTH_LONG).show();
                        mfm = getSupportFragmentManager();
                        mft= mfm.beginTransaction();
                        mft.replace(R.id.continer, new GenralFragment(tittle));
                        mft.commit();
                        break;
                }
                return false;
            }
        });
        mdrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionbardrawertoggle = new
                ActionBarDrawerToggle(this, mdrawerLayout, mtoolbar, R.string.openDrawer, R.string.closeDrawer) {
                    @Override
                    public void onDrawerClosed(View drawerView) {
                        //Log.e("sample", "sa ");

                        super.onDrawerClosed(drawerView);
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        super.onDrawerOpened(drawerView);
                    }
                };
        mdrawerLayout.addDrawerListener(actionbardrawertoggle);
        actionbardrawertoggle.syncState();
    }

}
