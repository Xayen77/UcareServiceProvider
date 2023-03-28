package com.ucareserviceprovider;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PersonalAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_account);
    }

    public void editProfile(View view) {
    }

    public void Details(View view) {
       Intent intent = new Intent(this, DetailsActivity.class);
       startActivity(intent);

       //THIS METHOD creates a new object to launch the detials activity and then calls"StartActivity" to launch the new activity.

    }

    public void BusinessAccount(View view) {
    }

    public void PaymentMethod(View view) {
    }

    public void Services(View view) {
    }

    public void History(View view) {
    }

    public void PrivacyPolicy(View view) {
    }

    public void Settings(View view) {
    }

    public void AboutUs(View view) {
    }

    public void logOut(View view) {
    }

    //////////////////////PROVIDER ADDITIONAL INFORMATION//////////////////////////////////////////////////////////

    public void PersonalAccount(View view) {
    }

    public void Wallet(View view) {
    }

    public void ServiceProvider(View view) {
    }



}