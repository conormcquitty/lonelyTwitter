package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    //JUnit test method for adding tweet into TweetList
    public void testAddTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));

        Boolean testTweet;

        try {
            tweetList.add(tweet);
            testTweet = Boolean.FALSE;
        }
        catch (IllegalArgumentException e){
            testTweet = Boolean.TRUE;
        }
        assertTrue(testTweet);
    }

    //JUnit test method for checking whether a tweet is in the TweetList
    public void testHasTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");

        tweetList.add(tweet);
        Tweet retrievedTweet = tweetList.getTweet(0);

        assertEquals(retrievedTweet.getMessage(), tweet.getMessage());
        assertEquals(retrievedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("one for delete");
        tweetList.add(tweet);
        tweetList.delete(tweet);

        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweetList = new TweetList();
        assertEquals(tweetList.getCount(), 0);
        Tweet tweet = new NormalTweet("get tweet count check");

        tweetList.add(tweet);
        assertEquals(tweetList.getCount(), 1);
    }

    public void testGetTweets(){
        TweetList tweetList = new TweetList();
        tweetList.add(new NormalTweet("test tweets 1"));
        tweetList.add(new NormalTweet("test tweets 2"));

        assertEquals(tweetList.getTweets().get(0).getMessage(), "test tweets 1");
        assertEquals(tweetList.getTweets().get(1).getMessage(), "test tweets 2");
    }


}
