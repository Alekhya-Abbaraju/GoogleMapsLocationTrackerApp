 # This is an Android App which will be redirected To Google Maps !!
 ## This is written In Java Language Which is very simple.. Here i used URI 

 ####  Uri  uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");

##### Uri uri=Uri.parse("https://www.google.com/maps/dir/"+from+"/"+to);

###### If You want to write in Kotlin You must Add These 👇Dependencies in build.gradile File

 ```dependencies {
        compile 'com.github.quentin7b:android-location-tracker:4.0'
}
```

###### You should also add These 👇 Permissions in AndroidManifest.XML
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />

###### Get to know As per Your Anroid Verions ::: Android Marshmallow's new permission system

<permission-group
   android:name="android.permission-group.LOCATION"
   android:label="A label for your permission"
   android:description="A description for the permission" />

![Screenshot (4)](https://github.com/Alekhya-Abbaraju/GoogleMapsLocationTrackerApp/assets/129656745/605244ae-71e2-4ed1-8946-504b94041e4c)

![Screenshot (5)](https://github.com/Alekhya-Abbaraju/GoogleMapsLocationTrackerApp/assets/129656745/8b9a4958-9fef-4b3e-9302-46917e88ff9f)

You can also view Preview here!!
![Screenshot (6)](https://github.com/Alekhya-Abbaraju/GoogleMapsLocationTrackerApp/assets/129656745/25799c1d-c17a-4565-a773-f81e04ab19d2)


