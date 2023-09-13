package com.example.gpslocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFromLocation;
    private EditText etToLocation;
    private Button etGetDirection;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFromLocation = findViewById(R.id.etFromLocation);
        etToLocation=findViewById(R.id.etToLocation);
        etGetDirection=findViewById(R.id.etGetDirection);

         etGetDirection.setOnClickListener(view ->{
             String userLocation=etFromLocation.getText().toString();
             String userDestination=etToLocation.getText().toString();
             if(userLocation.equals("") || userDestination.equals("")){
                 Toast.makeText(this,"Please Enter Your location and Destination",Toast.LENGTH_SHORT).show();
             }
             else{
                 getDirections(userLocation,userDestination);
             }
         });
    }
    private void getDirections(String from,String to){
         try{
             Uri uri=Uri.parse("https://www.google.com/maps/dir/"+from+"/"+to);
             Intent intent = new Intent(Intent.ACTION_VIEW,uri);
             intent.setPackage("com.google.android.apps.maps");
             intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             startActivity(intent);
         }catch(ActivityNotFoundException exception){
             Uri  uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
             Intent intent = new Intent(Intent.ACTION_VIEW,uri);
             intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             startActivity(intent);
         }
    }
}