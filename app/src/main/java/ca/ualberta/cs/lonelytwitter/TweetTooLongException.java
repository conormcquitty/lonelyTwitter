package ca.ualberta.cs.lonelytwitter;

/**
 *Handles the exception when your tweet is too long
 */
public class TweetTooLongException extends Exception {

    TweetTooLongException(){
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
