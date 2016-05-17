package com.panchince.jjfnino.resultadosamateur;

/**
 * Created by jnino on 13/05/2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

//you will need to import throughout the creation of this code.
//The class needs to extend Fragment
public class MyFragTwo extends Fragment {
    //The newInstance() method return the reference to  fragment
    public static MyFragTwo newInstance() {
        MyFragTwo fragment = new MyFragTwo();
        return fragment;
    }
    //MyFragment is the constructor method of our class.
    //this is a java thing. Google it as you this is basic
    //java that you need to know.
    public MyFragTwo() {
    }
    //since we have a button and textview on the xml will use these two
    //variable to connect to them.
    Button button2;
    TextView daveText;
    WebView webView;
    //this method links the fragment to the layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //connecting the fragment to our layout, my_page_two
        View rootView = inflater.inflate(R.layout.my_page_two, container, false);
        //then the btn and the textview
        /*button2 = (Button) rootView.findViewById(R.id.button3);
        daveText = (TextView) rootView.findViewById(R.id.textView3);
        daveText.setText("Hello Fayer");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(daveText.getText().toString().contains("Hello Fayer")){
                    daveText.setText("I'm sorry Dave I can't do that.");
                }else daveText.setText("Hello Fayer");
            }
        });*/
        // return our View
        webView = (WebView) rootView.findViewById(R.id.webView);
        webView.loadUrl("http://northchamp.com.ar/m_torneos_zona_posiciones.asp?id_torneo=2826");
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String Url){
                return false;
            }
        });
        return rootView;
    }


} // This is the end. But we still have to change the mainactivity.java to work with it.
