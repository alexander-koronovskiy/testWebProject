import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import logic.*;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        Cart cart = (Cart)session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));


        if (cart==null){
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/ShowCart.jsp").forward(request,response);


        /*
        это редирект
        response.sendRedirect("testJsp");

        а это форвард
        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp");
        dispatcher.forward(request, response);
        */
    }
}
