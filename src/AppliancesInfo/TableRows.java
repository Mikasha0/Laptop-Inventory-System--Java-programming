/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppliancesInfo;

/**
 *
 * @author Aadesh
 */
public class TableRows {
    private String ID;
    private String Name;
    private String Category;
    private String Range_Level;
    private String Type;
    private int Price;

    public TableRows(String ID, String Name, String Category, String Range_Level, String Type, String Price) {
        this.ID = ID;
        this.Name = Name;
        this.Category = Category;
        this.Range_Level = Range_Level;
        this.Type = Type;
        this.Price = Integer.parseInt(Price);
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCategory() {
        return Category;
    }

    public String getRange_Level() {
        return Range_Level;
    }

    public String getType() {
        return Type;
    }

    public int getPrice() {
        return Price;
    }

    
}
