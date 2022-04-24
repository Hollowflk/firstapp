import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ProductList", urlPatterns = "/productList")
public class ProductList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Product(1L,"Bread",23L),
                new Product(2L,"Sugar",42L),
                new Product(3L,"Milk",73L),
                new Product(4L,"Cola",222L),
                new Product(5L,"Eggs",89L),
                new Product(6L,"Meat",67L),
                new Product(7L,"Cheese",89L),
                new Product(8L,"Pepsi",86L),
                new Product(9L,"Mars",234L),
                new Product(10L,"Chocolate",11L)
        ));
        for (Product product : productList){
            resp.getWriter().println("<h1>" + product + "</h1>");
        }
    }
}
