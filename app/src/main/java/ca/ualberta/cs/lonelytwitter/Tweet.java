package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARACTERS = 140;

    //constructor is name of class itself usually. you can have two types, one with no arguments
    //and one with arguments that uses arguements to set things.

    Tweet(){
        //'this' gives you context for your declaration.
        this.date = new Date();
        this.message = "I am default message";
    }

    //Overlading so that we can specify the tweet content
    Tweet(String message){
        //'this' gives you context for your declaration.
        this.date = new Date();
        this.message = message;
    }

    public Date getDate() {return this.date;}

    public String getMessage(){
        return this.message;
    }

    public void setMessage (String message) throws TweetTooLongException{
        if (message.length()<= this.MAX_CHARACTERS){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public String toString(){
        return this.message + "\n" + this.getDate();
    }
    public abstract Boolean isImportant();
}
