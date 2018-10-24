package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class EditTweetActivity extends Activity {

    Tweet tweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent i = getIntent();
        tweet  = (Tweet)i.getSerializableExtra("Tweet");

        String message = tweet.getMessage();
        Date date = tweet.getDate();

        setValues(message, date);
    }


    void setValues(String message, Date date){
        TextView tweetMessage = (TextView) findViewById(R.id.messageTweet);
        tweetMessage.setText(message);
    }

}
