package taho.oliokurssi.harjoitustyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddLutemonActivity extends AppCompatActivity {

    private EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lutemon);

        nameInput = findViewById(R.id.txtNameInput);
    }

    public void addLutemon (View view) {
        String lutemonName = nameInput.getText().toString();
        String lutemonColor = "";

        RadioGroup selectedColor = findViewById(R.id.rgColorSelection);

        if (selectedColor.getCheckedRadioButtonId() == R.id.rbWhite) {
            lutemonColor = "Valkoinen";
        }
        else if (selectedColor.getCheckedRadioButtonId() == R.id.rbGreen) {
            lutemonColor = "Vihreä";
        }
        else if (selectedColor.getCheckedRadioButtonId() == R.id.rbPink) {
            lutemonColor = "Pinkki";
        }
        else if (selectedColor.getCheckedRadioButtonId() == R.id.rbOrange) {
            lutemonColor = "Oranssi";
        }
        else {
            lutemonColor = "Musta";
        }

        Home.getInstance().createNewLutemon(new Lutemon(lutemonName, lutemonColor));

        Intent intent = new Intent(this, MainScreenActivity.class);
        startActivity(intent);
    }




}