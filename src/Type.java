/**
 * Created by vkravets on 13.02.2018.
 */
public enum Type {
    TOMATO, MUSHROOM;

    public boolean isTomato(){
        return this == TOMATO;
    }

    public boolean isMushroom(){
        return !isTomato();
    }

    public boolean is(Type type){
        return this == type;
    }
}
