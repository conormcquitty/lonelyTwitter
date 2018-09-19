package ca.ualberta.cs.lonelytwitter;

//Inheritance!
public class ImportantTweet extends Tweet {

    ImportantTweet(){
        super();
    }


    @Override
    public Boolean isImportant(){
        return true;
    }
}
