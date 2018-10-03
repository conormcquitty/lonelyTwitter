package ca.ualberta.cs.lonelytwitter;

//Inheritance!

/**
 *Class that holds important tweets
 */
public class ImportantTweet extends Tweet {

    ImportantTweet(){
        super();
    }


    @Override
    public Boolean isImportant(){
        return true;
    }
}
