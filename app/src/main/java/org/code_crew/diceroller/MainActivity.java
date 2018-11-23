package org.code_crew.diceroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView dice_picture;
    Random generate = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        imageView = View.findViewById(R.id.imageView);
        dice_picture = (ImageView) findViewById(R.id.imageView);

    }

    public void roll(View view) {

        int diceNum = generate.nextInt(7) + 1;
        System.out.println(diceNum);
        switch (diceNum)
        {
            case (1):
                dice_picture.setImageResource(R.drawable.one);
                break;
            case (2):
                dice_picture.setImageResource(R.drawable.two);
                break;
            case (3):
                dice_picture.setImageResource(R.drawable.three);
                break;






        }

    }

//    public void Roll(View view){
//        int myimage[one.png,four.png,five.png,six.png] = new int(6);
//
//        int diceNum = generate.nextInt(7);
//        System.out.println(diceNum);
//
//
//
//
//        imageView.setVisible(true);
//
//
//


//    }
}