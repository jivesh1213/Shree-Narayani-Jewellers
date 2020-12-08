package pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class validations {
    public boolean isValid(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
    public boolean numValid(String number){
        String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
        return number.matches(regex);
    }
    public boolean pinValid(String code){
        String regex = "^[1-9][0-9]{5}$";
        return code.matches(regex);
    }
    public String Date(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();
        String d = formatter.format(date);
        return d;
    }
    public String Time(){
        Date date = new Date();
        String strDateFormat = "hh:mm a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(date);
        return formattedDate;
    }
    
}
