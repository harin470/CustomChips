package com.uigitdev.customchips;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uigitdev.customchips.uigitdev.design.MCustomChip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MCustomChip customChip = new MCustomChip(findViewById(R.id.custom_chip));
        MCustomChip customChip1 = new MCustomChip(findViewById(R.id.custom_chip1));
        MCustomChip customChip2 = new MCustomChip(findViewById(R.id.custom_chip2));
        MCustomChip customChip3 = new MCustomChip(findViewById(R.id.custom_chip3));

        chipClick(customChip);
        chipClick(customChip1);
        chipClick(customChip2);
        chipClick(customChip3);

        chipClearClick(customChip);
        chipClearClick(customChip1);
        chipClearClick(customChip2);
        chipClearClick(customChip3);

        Toast.makeText(MainActivity.this, customChip.getText(), Toast.LENGTH_LONG).show();
        customChip1.setText("Chip test text");
        //customChip2.clearButtonHide();
        customChip1.setIconColor("#131313");
        customChip1.setClearBackgroundColor("#131313");
        customChip1.setClearIconColor("#FFFFFF");
        customChip1.setTextColor("#131313");
        customChip1.setBackgroundColor("#E2E2E2");
        customChip1.setChipIcon(R.drawable.ic_person);

        customChip2.setText("Dark Chip Button");
        customChip2.setChipClearIcon(R.drawable.ic_delete);
        customChip2.setClearSizeMini();
        customChip2.dark();
        customChip2.setChipImage("https://scontent-vie1-1.cdninstagram.com/vp/0c732adf35d3ce54ac2870cbc4f184e6/5E18880C/t51.2885-15/e35/67306749_176349156728999_8678119365542176763_n.jpg?_nc_ht=scontent-vie1-1.cdninstagram.com&_nc_cat=111", R.drawable.ic_launcher_background);

        customChip3.setClearSizeMini();
        customChip3.setChipImage("https://scontent-vie1-1.cdninstagram.com/vp/0daabc42f8b01ea2a2e10d9fcc4d4e38/5E39C499/t51.2885-15/e35/37153921_1996406683749914_1588733283535945728_n.jpg?_nc_ht=scontent-vie1-1.cdninstagram.com&_nc_cat=102", R.drawable.ic_launcher_background);
        customChip3.setText("David Toth - Uigitdev");
        customChip3.setClearIconColor("#FFFFFF");
        customChip3.setClearBackgroundColor("#0069c0");
        customChip3.setBackgroundColor("#e3f2fd");
        customChip3.setTextColor("#0069c0");
        customChip3.setButtonElevation(5);
        customChip1.setButtonElevation(5);
    }

    private void chipClick(MCustomChip customChip) {
        customChip.chip_click_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void chipClearClick(MCustomChip customChip) {
        customChip.chip_clear_click_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clear Click", Toast.LENGTH_LONG).show();
            }
        });
    }
}
