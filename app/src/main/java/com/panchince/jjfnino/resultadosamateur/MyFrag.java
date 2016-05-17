package com.panchince.jjfnino.resultadosamateur;

/**
 * Created by jnino on 13/05/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
//you will need to import throughout the creation of this code.
//The class needs to extend Fragment
public class MyFrag extends Fragment {
    //The newInstance() method return the reference to  fragment
    public static MyFrag newInstance() {
        MyFrag fragment = new MyFrag();
        return fragment;
    }
    //MyFragment is the constructor method of our class.
    //this is a java thing. Google it as you this is basic
    //java that you need to know.
    public MyFrag() {
    }
    //since we have a button and textview on the xml will use these two
    //variable to connect to them.
    Button button2;
    TextView daveText;
    ListView listView ;



    //this method links the fragment to the layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //connecting the fragment to our layout, my_page_one
        View rootView = inflater.inflate(R.layout.my_page_one, container, false);

        // Get ListView object from xml
        listView = (ListView) rootView.findViewById(R.id.list);
        // Defined Array values to show in ListView
        String[] values = { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View",
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View",
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        //Create the ArrayAdapter
        /*ArrayAdapter<String> myAdapter=new
                ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                myStringArray);*/


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        //then the btn and the textview
        //button2 = (Button) rootView.findViewById(R.id.button2);
        //daveText = (TextView) rootView.findViewById(R.id.textView2);

        /*button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(daveText.getText().toString().contains("Hello Dave")){
                    daveText.setText("I'm sorry Dave I can't do that.");
                }else daveText.setText("Hello Dave");
            }
        });*/
        // return our View
        return rootView;
    }
} // This is the end. But we still have to change the mainactivity.java to work with it.
