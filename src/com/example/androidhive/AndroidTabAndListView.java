package com.example.androidhive;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AndroidTabAndListView extends TabActivity {
	// TabSpec Names
	private static final String INDIA = "India";
	private static final String SPORTS = "Sports";
	private static final String TECH = "Tech";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TabHost tabHost = getTabHost();
        
        // Inbox Tab
        TabSpec inboxSpec = tabHost.newTabSpec(INDIA);
        // Tab Icon
        inboxSpec.setIndicator(INDIA, getResources().getDrawable(R.drawable.icon_inbox));
        Intent inboxIntent = new Intent(this, India.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);
        
        // Outbox Tab
        TabSpec outboxSpec = tabHost.newTabSpec(SPORTS);
        outboxSpec.setIndicator(SPORTS, getResources().getDrawable(R.drawable.icon_outbox));
        Intent outboxIntent = new Intent(this, Sports.class);
        outboxSpec.setContent(outboxIntent);
        
        // Profile Tab
        TabSpec profileSpec = tabHost.newTabSpec(TECH);
        profileSpec.setIndicator(TECH, getResources().getDrawable(R.drawable.icon_profile));
        Intent profileIntent = new Intent(this, Tech.class);
        profileSpec.setContent(profileIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(outboxSpec); // Adding Outbox tab
        tabHost.addTab(profileSpec); // Adding Profile tab
    }
}