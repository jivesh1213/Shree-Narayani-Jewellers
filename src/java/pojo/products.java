package pojo;

public class products {
    
    private String itemname;
    private String weight;
    private String polish;
    private String category;
    private String description;
    private String purity;
    private String image;
    
    public products(String itemname, String weight, String polish, String category, String description, String purity, String image) {
        this.itemname = itemname;
        this.weight = weight;
        this.polish = polish;
        this.category = category;
        this.description = description;
        this.purity = purity;
        this.image = image;
        
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
