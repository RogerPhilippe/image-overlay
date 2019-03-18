package br.com.philippesis.imageoverlay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mainEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setupUI();
        this.setupListener();

        Toast.makeText(this, "Exibição Toast Text", Toast.LENGTH_LONG).show();

    }

    private void setupUI() {
        mainEdit = findViewById(R.id.id_main_edit);
    }

    private void setupListener() {
        mainEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mainEdit) {
            mainEdit.setCursorVisible(true);
        }
    }
}
