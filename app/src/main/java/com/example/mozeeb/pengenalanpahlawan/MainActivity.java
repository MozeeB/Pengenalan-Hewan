package com.example.mozeeb.pengenalanpahlawan;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String[] nameArray = {"Bull", "Chick", "Crab", "Fox", "Hedgehog", "Hippopotamus","Koala","Lemur","Pig","Tiger","Whale","Zebra"};

        String[] infoArray = {
                "8 tentacled monster",
                "Delicious in rolls",
                "Great for jumpers",
                "Nice in a stew",
                "Great for shoes",
                "Scary.",
                "Cute Animals",
                "Unknow Animals",
                "Pig is Bad Animals",
                "Tiger is Wild Animals",
                "Whale is Sea Animals",
                "Body color Zebra is Black & White"
        };

        Integer[] imageArray = {R.drawable.bull,
                R.drawable.chick,
                R.drawable.crab,
                R.drawable.fox,
                R.drawable.hedgehog,
                R.drawable.hippopotamus,
                R.drawable.koala,
                R.drawable.lemur,
                R.drawable.pig,
                R.drawable.tiger,
                R.drawable.whale,
                R.drawable.zebra
        };

        ListView listView;
        adapter whatever = new adapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.list2);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, details.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }
        });
    }
}

