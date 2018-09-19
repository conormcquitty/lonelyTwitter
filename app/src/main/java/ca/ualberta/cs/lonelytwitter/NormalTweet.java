package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {

    NormalTweet(){
        super();
    }


    @Override
    public Boolean isImportant(){
        return false;
    }
}
