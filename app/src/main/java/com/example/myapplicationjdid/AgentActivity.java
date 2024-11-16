package com.example.myapplicationjdid;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.util.Log;

public class AgentActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent);

        // Initialize BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigation);

        // Set the listener for menu item selection
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId(); // Get the selected item ID

            if (id == R.id.nav_dashboard) {
                // Navigate to DashboardActivity
                Intent dashboardIntent = new Intent(AgentActivity.this, Dashboard_Agent_Activity.class);
                startActivity(dashboardIntent);
                return true;

            } else if (id == R.id.nav_notifications) {
                // Handle notifications
                Log.d("AgentActivity", "Notifications clicked");
                return true;

            } else if (id == R.id.nav_absences) {
                // Handle absences
                Log.d("AgentActivity", "Absences clicked");
                return true;
            }

            return false;
        });
    }
}
