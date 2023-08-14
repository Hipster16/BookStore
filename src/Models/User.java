package Models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {
    private String UserName;
    private String Password;
    private List<Orders> Orders;
    private List<Orders> History;
    private List<Wishlist> wishes;
    private String Permission;

    public User(String UserName, String Password, String Permission) {
        this.UserName = UserName;
        this.Password = Password;
        this.Permission = Permission;
        Orders = new ArrayList<Orders>();
        History = new ArrayList<Orders>();
        wishes = new ArrayList<Wishlist>();
    }
    
    public void addToCart(Orders elem) {
        Boolean exist = false ;
        for(Orders order: Orders) {
            if(order.getBookName().equals(elem.getBookName())) {
                exist = true;
                order.setQuantity(order.getQuantity() + elem.getQuantity());
            }
        }
        if(!exist)
            Orders.add(elem);
    }

    public void addToWishlist(Wishlist elem) {
        Boolean exist = false ;
        for(Wishlist wish: wishes) {
            if(wish.getBname().equals(elem.getBname())) {
                exist = true;
            }
        }
        if(!exist)
            wishes.add(elem);
    }

    public String removeFromWishList(String name) {
        Boolean exist = false ;
        for(int i=0; i<wishes.size(); i++) {
            if(wishes.get(i).getBname().equals(name)) {
                wishes.remove(i);
                exist = true;
                return "Book Removed from wishlist";
            }
        }
        if(!exist)
            return "Book not found in wishlist";
        return "";
    }
}
