package com.kc.tictactoe0x;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int[] a;
    public int p;
    public int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = new int[9];
        count = 0;

        for(int i=0;i<9;i++)
        {
            a[i] = 0;
        }
        p=1;

    }

    public void button1(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button1 = findViewById(R.id.button);

            if(p==1&&a[0]==0) {
                button1.setText("O");
                p=2;
                a[0]=1;
                count++;
                x.setBackgroundColor(getResources().getColor(R.color.green));
                o.setBackgroundColor(getResources().getColor(R.color.red));
            }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

            if(p==2&&a[0]==0) {
                button1.setText("X");
                p=1;
                a[0]=2;
                count++;
                o.setBackgroundColor(getResources().getColor(R.color.green));
                x.setBackgroundColor(getResources().getColor(R.color.red));
            }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
            {
                result.setText("X WINS");
                x.setBackgroundColor(getResources().getColor(R.color.yellow));
                for(int i=0;i<9;i++)
                {
                    a[i] = 3;
                }
            }



        }

    public void button2(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button2 = findViewById(R.id.button2);

        if(p==1&&a[1]==0) {
            button2.setText("O");
            p=2;
            a[1]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[1]==0) {
            button2.setText("X");
            p=1;
            a[1]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }


    }

    public void button3(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button3 = findViewById(R.id.button3);

        if(p==1&&a[2]==0) {
            button3.setText("O");
            p=2;
            a[2]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[2]==0) {
            button3.setText("X");
            p=1;
            a[2]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }




    }

    public void button4(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button4 = findViewById(R.id.button4);

        if(p==1&&a[3]==0) {
            button4.setText("O");
            p=2;
            a[3]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[3]==0) {
            button4.setText("X");
            p=1;
            a[3]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
                for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }


    }

    public void button5(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button5 = findViewById(R.id.button5);

        if(p==1&&a[4]==0) {
            button5.setText("O");
            p=2;
            a[4]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[4]==0) {
            button5.setText("X");
            p=1;
            a[4]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }


    }

    public void button6(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button6 = findViewById(R.id.button6);

        if(p==1&&a[5]==0) {
            button6.setText("O");
            p=2;
            a[5]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[5]==0) {
            button6.setText("X");
            p=1;
            a[5]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }


    }

    public void button7(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button7 = findViewById(R.id.button7);

        if(p==1&&a[6]==0) {
            button7.setText("O");
            p=2;
            a[6]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[6]==0) {
            button7.setText("X");
            p=1;
            a[6]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }


    }

    public void button8(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button8 = findViewById(R.id.button8);

        if(p==1&&a[7]==0) {
            button8.setText("O");
            p=2;
            a[7]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[7]==0) {
            button8.setText("X");
            p=1;
            a[7]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }



    }

    public void button9(View v) {
        TextView result = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);
        Button button9 = findViewById(R.id.button9);

        if(p==1&&a[8]==0) {
            button9.setText("O");
            p=2;
            a[8]=1;
            count++;
            x.setBackgroundColor(getResources().getColor(R.color.green));
            o.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if(a[0]==1 && a[1]==1 && a[2]==1 || a[3]==1 && a[4]==1 && a[5]==1 || a[6]==1 && a[7]==1 && a[8]==1 || a[0]==1 && a[3]==1 && a[6]==1 || a[1]==1 && a[4]==1 && a[7]==1 || a[2]==1 && a[5]==1 && a[8]==1 || a[0]==1 && a[4]==1 && a[8]==1 || a[6]==1 && a[4]==1 && a[2]==1)
        {
            result.setText("O WINS");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }
        else if(count>8)
        {
            result.setText("DRAW");
            o.setBackgroundColor(getResources().getColor(R.color.yellow));
            x.setBackgroundColor(getResources().getColor(R.color.yellow));

        }

        if(p==2&&a[8]==0) {
            button9.setText("X");
            p=1;
            a[8]=2;
            count++;
            o.setBackgroundColor(getResources().getColor(R.color.green));
            x.setBackgroundColor(getResources().getColor(R.color.red));
        }


        if(a[0]==2 && a[1]==2 && a[2]==2 || a[3]==2 && a[4]==2 && a[5]==2 || a[6]==2 && a[7]==2 && a[8]==2 || a[0]==2 && a[3]==2 && a[6]==2 || a[1]==2 && a[4]==2 && a[7]==2 || a[2]==2 && a[5]==2 && a[8]==2 || a[0]==2 && a[4]==2 && a[8]==2 || a[6]==2 && a[4]==2 && a[2]==2)
        {
            result.setText("X WINS");
            x.setBackgroundColor(getResources().getColor(R.color.yellow));
            for(int i=0;i<9;i++)
            {
                a[i] = 3;
            }
        }

    }

    public void reset(View v){
        count = 0;

        for(int i=0;i<9;i++)
        {
            a[i] = 0;
        }
        p=1;

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        TextView v1 = findViewById(R.id.textView);
        TextView o = findViewById(R.id.textView2);
        TextView x = findViewById(R.id.textView3);

        o.setBackgroundColor(getResources().getColor(R.color.green));
        x.setBackgroundColor(getResources().getColor(R.color.red));

        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
        v1.setText("Tap To Play");


    }

}
