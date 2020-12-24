package com.ulum.pemburucoffee;

//import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class CariActivity extends Activity {
    ListView myListView;
    ListView myListView2;
    Spinner mySpinner;

    ArrayAdapter adapter;
    String[] categories={"All","Malang",
            "Surabaya",
            "Bandung",
            "jakarta",
            "yokyakarta"};


    /*
    when activity is created, setContentView then initializeViews.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);

        initializeViews();
    }
    private void initializeViews() {

        mySpinner = findViewById(R.id.mySpinner);
        mySpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories));

        myListView = findViewById(R.id.myListView);
        myListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getCosmicBodies()));



        //spinner selection events
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long itemID) {
                if (position >= 0 && position < categories.length) {
                    getSelectedCategoryData(position);
                } else {
                    Toast.makeText(CariActivity.this, "Selected Category Does not Exist!", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    /*
    Populate an arraylist that will act as our data source.
     */
    private ArrayList<com.ulum.pemburucoffee.CosmicBody> getCosmicBodies() {
        ArrayList<CosmicBody> data = new ArrayList<>();
        data.clear();
//malang
        data.add(new CosmicBody("Bukit Delight \n jl.tidar", 1));
        data.add(new CosmicBody("Bataputi Cafe \n jl.Bataputi", 1));
        data.add(new CosmicBody("Labore Coffee Eatery \n jl.Labore", 1));
        data.add(new CosmicBody("Akalpa Café \n jl.Akalpa", 1));
        data.add(new CosmicBody("Rumah Opa Kitchen and Lounge \n jl.Opa", 1));
        data.add(new CosmicBody("Sub Bring \n jl.Bring", 1));
        data.add(new CosmicBody("Cokelat Klasik Cafe & Garden \n jl.Klasik", 1));
        data.add(new CosmicBody("Volks Waffle Streatery \n Streatery", 1));
        data.add(new CosmicBody("Kafe Momochi \n jl.Momochi", 1));
        data.add(new CosmicBody("The 1920 Cafe \n jl.kopi", 1));
        data.add(new CosmicBody("DW Coffee \n jl.dw", 1));
      // surabaya
        data.add(new CosmicBody("Antler Cabin Surabaya \n  jl.surabaya ", 2)); // 1
        data.add(new CosmicBody("Cafe Petangkringan\n \n  jl.surabaya ", 2)); // 2
        data.add(new CosmicBody("Warkop Opa\n  jl.surabaya ", 2)); // 3
        data.add(new CosmicBody("Calibre Coffee Roasters\n  jl.surabaya ", 2)); // 4
        data.add(new CosmicBody("Ijen Cafe Surabaya\n  jl.surabaya ", 2)); // 5
        data.add(new CosmicBody("Shae Cafe and Eatery\n  jl.surabaya ", 2)); // 6
        data.add(new CosmicBody("Rolag Coffee Surabaya\n  jl.surabaya ", 2)); // 7
        data.add(new CosmicBody("The Brothers Cafe\n  jl.surabaya ", 2)); // 8
        data.add(new CosmicBody("Le Belle Cafe Surabaya\n  jl. jl.surabaya ", 2)); // 9
        data.add(new CosmicBody("Montase Cafe Surabaya\n  jl.surabaya ", 2)); // 10
     // Bandung
        data.add(new CosmicBody("Dusun Bambu  \n jl.bandun ", 3)); // 1
        data.add(new CosmicBody("Tafso Barn \n jl.bandun ", 3)); // 2
        data.add(new CosmicBody("Dago Bakery Punclut \n jl.bandun ", 3)); // 3
        data.add(new CosmicBody("Kalpa Tree Dine And Chill \n jl.bandun ", 3)); // 4
        data.add(new CosmicBody("Orofi Cafe By The Valley \n jl.bandun ", 3)); // 5
        data.add(new CosmicBody("Goldstar 360 \n jl.bandun ", 3)); // 6
        data.add(new CosmicBody("Pepo Appetite \n jl.bandun ", 3)); // 7
        data.add(new CosmicBody("Beus Cafe \n jl.bandun ", 3)); // 8
        data.add(new CosmicBody("One Eight Coffee \n jl.bandun ", 3)); // 9
        data.add(new CosmicBody("La Costilla Bandung \n jl.bandun ", 3)); // 10
        //jakarta
        data.add(new CosmicBody("Take A Bite Cafe \n jl.jakarta ", 4)); // 1
        data.add(new CosmicBody("Arborea Café \n jl.jakarta ", 4)); // 2
        data.add(new CosmicBody("Miss Unicorn Cafe \n jl.jakarta ", 4)); // 3
        data.add(new CosmicBody("My BunBun Rabbit Café \n jl.jakarta ", 4)); // 4
        data.add(new CosmicBody("PikNik at Arif Inn \n jl.jakarta ", 4)); // 5
        data.add(new CosmicBody("The Barkbershop Pet Grooming & Cafe \n jl.jakarta ", 4)); // 6
        data.add(new CosmicBody("The Cat Cabin \n jl.jakarta ", 4)); // 7
        data.add(new CosmicBody("The Garden \n jl.jakarta ", 4)); // 8
        data.add(new CosmicBody("ONNI House \n jl.jakarta ", 4)); // 9
        data.add(new CosmicBody("Happiness Kitchen and Coffee \n jl.jakarta ", 4)); // 10
        //yokyakarta
        data.add(new CosmicBody("Roaster And Bear \n jl.yokyakarta ", 5)); // 1
        data.add(new CosmicBody("Epic Cafe \n jl.yokyakarta ", 5)); // 2
        data.add(new CosmicBody("Kongkalikong Dine & Coffee House \n jl.yokyakarta ", 5)); // 3
        data.add(new CosmicBody("Cafe Brick \n jl.yokyakarta ", 5)); // 4
        data.add(new CosmicBody("Awor Gallery And Coffee \n jl.yokyakarta ", 5)); // 5
        data.add(new CosmicBody("Djendelo Cafe \n jl.yokyakarta ", 5)); // 6
        data.add(new CosmicBody("Bong Kopitown \n jl.yokyakarta ", 5)); // 7
        data.add(new CosmicBody("Nox Coffee Boutique \n jl.yokyakarta ", 5)); // 8
        data.add(new CosmicBody("indische Coffee \n jl.yokyakarta ", 5)); // 9
        data.add(new CosmicBody("Secret Garden Coffee And Chocolate \n jl.yokyakarta ", 5)); // 10

        return data;

    }
    /*
    Get the selected category's cosmic bodies and bind to ListView
     */
    private void getSelectedCategoryData(final int categoryID) {
        //arraylist to hold selected cosmic bodies
        final ArrayList<CosmicBody> cosmicBodies = new ArrayList<>();
        if(categoryID == 0)
        {
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getCosmicBodies());
//            myListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                    String TempmyListView = adapter.getFilter(cosmicBodies);
//
//                    Intent intent = new Intent(CariActivity.this, SecondAcvtivity.class);
//
//                    intent.putExtra("myListViewclickvalue", TempmyListView);
//                    startActivity(intent);
//
//                }
//            });
        }else{
            //filter by id
            for (CosmicBody cosmicBody : getCosmicBodies()) {
                if (cosmicBody.getCategoryId() == categoryID) {
                    cosmicBodies.add(cosmicBody);
                }
            }
            //instatiate adapter a
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cosmicBodies);
        }

        //set the adapter to GridView
        myListView.setAdapter(adapter);


    }
}

/*
Data Object class to represent a single Cosmic body. Class has default access modifier
 */
class CosmicBody {
    private String name;
    private int categoryID;

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryID;
    }

    public CosmicBody(String name, int categoryID) {
        this.name = name;
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return name;

    }
}
