package com.uigitdev.customchips.uigitdev.design;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.uigitdev.customchips.R;

public class MCustomChip {
    private CardView chip_card_parent, chip_clear_card_parent;
    public RelativeLayout chip_click_parent, chip_clear_click_parent;
    private ImageView chip_icon, chip_clear_icon, chip_image;
    private TextView chip_text;

    public MCustomChip(View view) {
        setType(view);
    }

    private void setType(View view) {
        chip_card_parent = view.findViewById(R.id.chip_card_parent);
        chip_clear_card_parent = view.findViewById(R.id.chip_clear_card_parent);
        chip_click_parent = view.findViewById(R.id.chip_click_parent);
        chip_clear_click_parent = view.findViewById(R.id.chip_clear_click_parent);
        chip_icon = view.findViewById(R.id.chip_icon);
        chip_clear_icon = view.findViewById(R.id.chip_clear_icon);
        chip_text = view.findViewById(R.id.chip_text);
        chip_image = view.findViewById(R.id.chip_image);
    }

    public void setText(String text) {
        chip_text.setText(text);
    }

    public String getText() {
        return chip_text.getText().toString();
    }

    public void clearButtonHide() {
        chip_clear_card_parent.setVisibility(View.GONE);
    }

    public void setIconColor(String color) {
        chip_icon.setColorFilter(Color.parseColor(color), android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public void setClearBackgroundColor(String color) {
        chip_clear_card_parent.setCardBackgroundColor(Color.parseColor(color));
    }

    public void setClearIconColor(String color) {
        chip_clear_icon.setColorFilter(Color.parseColor(color), android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public void setTextColor(String color) {
        chip_text.setTextColor(Color.parseColor(color));
    }

    public void setBackgroundColor(String color) {
        chip_card_parent.setCardBackgroundColor(Color.parseColor(color));
    }

    public void setChipIcon(int iconId) {
        chip_icon.setImageResource(iconId);
    }

    public void setChipClearIcon(int iconId) {
        chip_clear_icon.setImageResource(iconId);
    }

    public void setClearSizeMini() {
        int card = 95, icon = 60;
        chip_clear_card_parent.getLayoutParams().height = card;
        chip_clear_card_parent.getLayoutParams().width = card;
        chip_clear_card_parent.setRadius(card / 2);
        chip_clear_icon.getLayoutParams().height = icon;
        chip_clear_icon.getLayoutParams().width = icon;
    }

    public void setChipImage(String imageURL, final int errorImage) {
        chip_icon.setVisibility(View.GONE);
        chip_image.setVisibility(View.VISIBLE);
        Picasso.get().load(imageURL).fit().centerCrop().into(chip_image, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError(Exception e) {
                chip_image.setBackgroundResource(errorImage);
            }
        });
    }

    public void setButtonElevation(float elevation){
        chip_card_parent.setElevation(elevation);
    }

    public void dark() {
        chip_card_parent.setCardBackgroundColor(Color.parseColor("#131313"));
        chip_icon.setColorFilter(Color.parseColor("#DADADA"), android.graphics.PorterDuff.Mode.SRC_IN);
        chip_clear_icon.setColorFilter(Color.parseColor("#DADADA"), android.graphics.PorterDuff.Mode.SRC_IN);
        chip_clear_card_parent.setCardBackgroundColor(Color.parseColor("#3C3C3C"));
        chip_text.setTextColor(Color.parseColor("#DADADA"));
    }
}
