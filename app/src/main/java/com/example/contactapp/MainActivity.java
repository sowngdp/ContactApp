package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.contactapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private ArrayList<ContactModel> contactList;
    private ContactsAdapter contactsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View viewRoot = binding.getRoot();
        setContentView(viewRoot);

        binding.rvContacts.setLayoutManager(new LinearLayoutManager(this));

        contactList = new ArrayList<ContactModel>();

        contactList.add(new ContactModel("Nguyễn Thị Thu Hiền", "0983820156", "null"));
        contactList.add(new ContactModel("Trần Thị Hồng Nhung", "1500120033", "null"));

        contactsAdapter = new ContactsAdapter(contactList);


        binding.rvContacts.setAdapter(contactsAdapter);

    }

}