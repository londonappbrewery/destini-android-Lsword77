package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mbtnTop;
    Button mbtnButton;
    TextView mtxtBody;
    int mintBody, mintTop, mintButton;

    final ChooseTheWay[] mChooseTheWay = new ChooseTheWay[]{
            new ChooseTheWay(R.string.T1_Story, R.string.T1_Ans1,R.string.T1_Ans2, 1),
            new ChooseTheWay(R.string.T2_Story,R.string.T2_Ans1, R.string.T2_Ans2, 2),
            new ChooseTheWay(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 3),
            new ChooseTheWay(R.string.T6_End, R.string.T3_Ans1, R.string.T3_Ans2, 4), // click T3_Ans1 Right
            new ChooseTheWay(R.string.T5_End, R.string.T3_Ans1,R.string.T3_Ans2, 5 ), //Click T3_Ans2 Left
            new ChooseTheWay(R.string.T4_End, R.string.T2_Ans1, R.string.T2_Ans2, 6) // click T2_ans2 left

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnTop = (Button) findViewById(R.id.buttonTop);
        mbtnButton = (Button) findViewById(R.id.buttonBottom);
        mtxtBody =(TextView) findViewById(R.id.storyTextView);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        displayOnScreen(0);
        mintTop = mChooseTheWay[0].isMblchoice();
        mintButton = mChooseTheWay[1].isMblchoice();


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbtnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Click top!", Toast.LENGTH_SHORT).show()
               DecideOptions(mintTop);

            }
        });
        
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getApplicationContext(), "Click button!", Toast.LENGTH_SHORT).show();
                DecideOptions(mintButton);
            }
        });

    }

    private  void DecideOptions(int choice) {
      if (choice == mChooseTheWay[0].isMblchoice()){
          displayOnScreen(2);
          mintTop = mChooseTheWay[3].isMblchoice();
          mintButton = mChooseTheWay[4].isMblchoice();
      }
      else if(choice == mChooseTheWay[3].isMblchoice()){
          displayOnScreen(3);
          mintButton = mChooseTheWay[4].isMblchoice();
      }
      else if(choice == mChooseTheWay[4].isMblchoice()){
          displayOnScreen(4);
          mintTop = mChooseTheWay[3].isMblchoice();
      }
      else if (choice == mChooseTheWay[1].isMblchoice()){
          displayOnScreen(1);
          mintTop = mChooseTheWay[2].isMblchoice();
          mintButton = mChooseTheWay[5].isMblchoice();
      }
      else if(choice == mChooseTheWay[2].isMblchoice()){
          displayOnScreen(2);
          mintTop = mChooseTheWay[3].isMblchoice();
          mintButton = mChooseTheWay[4].isMblchoice();
      }
      else if(choice == mChooseTheWay[5].isMblchoice()){
          displayOnScreen(5);
          mintTop = mChooseTheWay[2].isMblchoice();
      }

      else{
          Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
      }
    }

    private void displayOnScreen(int i){
        mintBody = mChooseTheWay[i].getMstrBodyText();
        mintButton = mChooseTheWay[i].getMstrButtonText();
        mintTop = mChooseTheWay[i].getMstrTopText();

        mtxtBody.setText(mintBody);
        mbtnTop.setText(mintTop);
        mbtnButton.setText(mintButton);
    }
}
