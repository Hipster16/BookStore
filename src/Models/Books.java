package Models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter 
public class Books {
    private String bookName;
    private String artistname;
    private int price;
    private int Quantity;
    private List<String> Reviews;

    public Books (String bookName, String artistname,  int price, int Quantity) {
        this.Quantity = Quantity;
        this.artistname = artistname;
        this.Reviews = new ArrayList<String>();
        this.price = price;
        this.bookName = bookName;
    }

    public void addReview(String rev) {
        Reviews.add(rev);
    }

    
}


