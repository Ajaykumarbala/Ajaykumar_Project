package dao;
import java.sql.*;

import connectionManager.ConnectionManager;
import model.Product;


public class ProductDAO {

public void addProduct(Product product) throws ClassNotFoundException,SQLException
{
ConnectionManager conn=new ConnectionManager();
Connection con=conn.establishConnection();

String sql="insert into product(productId,productName,minsell,price,quantity)values(?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);

ps.setInt(1,product.getproductId());
ps.setString(2,product.getproductName());
ps.setInt(3,product.getMinSellQuantity());
ps.setInt(4,product.getprice());
ps.setInt(5,product.getQuantity());

ps.executeUpdate();

conn.closeCConnection();
}

public void display() throws ClassNotFoundException,SQLException
{
ConnectionManager conn=new ConnectionManager();
Connection con=conn.establishConnection();

Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from product");

while(rs.next())
{
System.out.println("__________________________________________________________");
System.out.println(rs.getInt("productId")+" | "+(rs.getString("productName")+" | "
+rs.getInt("minsell")+" | "+rs.getInt("price"))+" | "
+rs.getInt("quantity"));
}
conn.closeCConnection();
}
}
