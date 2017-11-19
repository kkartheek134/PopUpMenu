package com.example.kartheek.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
        popupMenu.inflate(R.menu.menu_main);
        popupMenu.setGravity(50);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
