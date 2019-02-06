import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterestCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        String s1=req.getParameter("t1");
        String s2=req.getParameter("t2");   
        int amount=Integer.parseInt(s1);
        int time=Integer.parseInt(s2);
        int interest=0,net_amount=0;
        if(amount>10000&&time>3)
        {
        interest=(amount*6)/100;
        }
        else
        {
        interest=(amount*4)/100;
        }
        net_amount=amount+interest;
        PrintWriter out=resp.getWriter();
        out.println("THANKS FOR CHOOSING US");
        out.println("INTEREST YOU GOT " +interest);
        out.println("NET AMOUNT WILL BE " +net_amount);
        out.close();
    }


}
