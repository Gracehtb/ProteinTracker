package com.example.proteintracker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button layoutBtn = (Button) findViewById(R.id.LayoutButton);
        layoutBtn.setOnClickListener(layoutButtonListener);


        Button helpBtn = (Button) findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button relativeBtn = (Button) findViewById(R.id.relativeBtn);
        relativeBtn.setOnClickListener(relativeBtnListener);

        Button tableBtn = (Button) findViewById(R.id.tableBtn);
        tableBtn.setOnClickListener(tableBtnListener);

        Button AppBtn = (Button) findViewById(R.id.mainBtn);
        AppBtn.setOnClickListener(mainBtnListener);

        Button FragmentBtn = (Button) findViewById(R.id.fragmentBtn);
        FragmentBtn.setOnClickListener(fragmentBtnListener);

        Button FragmentMhsBtn = (Button) findViewById(R.id.mahasiswaBtn);
        FragmentMhsBtn.setOnClickListener(fragmenMhstBtnListener);

        Button ListBtn = (Button) findViewById(R.id.listBtn);
        ListBtn.setOnClickListener(listActivityListener);

        Button kelolaDataBtn = (Button) findViewById(R.id.kelolaBtn);
        kelolaDataBtn.setOnClickListener(kelolaMhsBtnListener);

        Button ReceycleBtn = (Button) findViewById(R.id.dataMhs);
        ReceycleBtn.setOnClickListener(recycleActivityListener);




        Button myBtn = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("Proteintracker", myEditText.getText().toString());
            }

        });
    }



    /*private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(intent);
        }

    };*/
    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);

            Bundle b = new Bundle();

            EditText myEditText = (EditText) findViewById(R.id.editText1);

            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    };
    private View.OnClickListener layoutButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener relativeBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main3Activity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener tableBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main4Activity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener mainBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main5Activity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener fragmentBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main6FragmentActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener fragmenMhstBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MahasiswaActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener kelolaMhsBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,KelolaDataActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener listActivityListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,ListActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener recycleActivityListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,DataMahasiswaActivity.class);
            startActivity(intent);
        }
    };


}

