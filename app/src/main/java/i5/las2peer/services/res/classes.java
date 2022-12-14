package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class DishRating {

    public DishRating() {}
    
    private String comment;

    public void setcomment(String setValue) {
        this.comment = setValue;
    }

    public String getcomment() {
        return this.comment;
    }
    private int stars;

    public void setstars(int setValue) {
        this.stars = setValue;
    }

    public int getstars() {
        return this.stars;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("comment", this.comment); 
        jo.put("stars", this.stars); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.comment = (String) jsonObject.get("comment"); 
        this.stars = ((Long) jsonObject.get("stars")).intValue(); 

    }

}

    
}
