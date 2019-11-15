

public class NonPerishable extends Product{

  private String productName;
  private int productID;
  private double productPrice;
  

  public Product(String productName, int productID, double productPrice){
    super(productName,productID,productPrice);
    setProductName(productName);
    setProductId(productID);
    setProductPrice(productPrice);
  }
  //set methods for the private variables
  public void setProductName(String productName){
    this.productName = productName;
  }
  public void setProductId(int productID){
    this.ProductID = productID;
  }
  public void setProductPrice(double productPrice){
    this.productPrice = productPrice;
  }
  //get methods for private variables
  public String getProductName(){
    return this.productName;
  }
  public int getProductId(){
    return this.productID;
  }
  public double getProductPrice(){
    return this.productPrice;
  }


}
