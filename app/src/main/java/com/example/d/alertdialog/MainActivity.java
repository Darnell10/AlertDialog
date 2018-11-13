package com.example.d.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;

    private Button showDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showDialog = findViewById(R.id.show_dialog);

        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show Actual Dialog
                alertDialog = new AlertDialog.Builder(MainActivity.this);

                // Things up
                // Setup title
                alertDialog.setTitle("Yeeerrrrrrrr");

                // Setup Icon
                alertDialog.setIcon(android.R.drawable.star_big_on);

                //Set Message
                alertDialog.setMessage("Whats good?!?!??!");

                //Set Cancelable - Makes it so that users don't accidently exit the alert Dialog
                alertDialog.setCancelable(false);

                //Set positive button
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        //Exit Window activity.
                        MainActivity.this.finish();

                    }
                });

                //Set Negative button
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.cancel();
                    }
                });


                // Create Actual Dialog

                AlertDialog dialog = alertDialog.create();

                //Show Dialog

                dialog.show();


            }
        });
    }


}
