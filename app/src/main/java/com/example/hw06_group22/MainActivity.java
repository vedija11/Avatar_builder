package com.example.hw06_group22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ProfileFragment.OnFragmentInteractionListener{

    /*ImageView iv_avatar;
    EditText et_fname, et_lname, et_studentID;
    Button button_save;
    RadioGroup radioGroup;
    RadioButton rb_cs, rb_sis, rb_bio, rb_other;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My Profile");

        getFragmentManager().beginTransaction().add(R.id.container, new ProfileFragment(), "profile").commit();

    }

    @Override
    public void gotoSelectAvatar() {

    }

    @Override
    public void gotoDisplayScreen() {
        getFragmentManager().beginTransaction().replace(R.id.container, new DisplayFragment(), "avatar").commit();
    }
}
