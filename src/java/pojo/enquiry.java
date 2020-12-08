package pojo;

public class enquiry {
    
    private String email;
    private String description;
    private String date;
    private Integer index;
    private String name;
    private String time;
    private String itemname;
    private String category;
    private String weight;
    
    public enquiry(String email, String description, String date, Integer index, String name, String time, String itemname, String category, String weight) {
        this.email = email;
        this.description = description;
        this.date = date;
        this.index = index;
        this.name = name;
        this.time = time;
        this.itemname = itemname;
        this.category = category;
        this.weight = weight;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    
}
