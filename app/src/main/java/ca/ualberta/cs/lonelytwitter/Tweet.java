package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class Tweet. Has a message (your tweet), a date and a maximum message.
 */

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARACTERS = 140;


    Tweet(){
        //'this' gives you context for your declaration.
        this.date = new Date();
        this.message = "I am default message";
    }

    /**
     * Constructor which sets date and message
     */
    Tweet(String message){
        //'this' gives you context for your declaration.
        this.date = new Date();
        this.message = message;
    }

    /**
     * Returns the date
     * @return
     */
    public Date getDate() {return this.date;}


    /**
     * Returns the Tweet's message
     * @return
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Function which allows your to set the Tweet's message
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage (String message) throws TweetTooLongException{
        if (message.length()<= this.MAX_CHARACTERS){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Function which turns your message and date into a string that your Array List can display easily
     * @return
     */
    public String toString(){
        return this.message + "\n" + this.getDate();
    }

    public abstract Boolean isImportant();
}
