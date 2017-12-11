import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class Webcalculator extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("com.seavus.web-calculator.web-calculatorServler.doGet");
        printMessage(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("com.seavus.hellowebworld.HelloWebWorldServlet.doPost");
        printMessage(req, resp);
    }


    protected void printMessage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operator = req.getParameter("operator");
        int number1=Integer.parseInt(req.getParameter("number1"));
        int number2=Integer.parseInt(req.getParameter("number2"));

        if(operator.equals("+")){
            int result=number1+number2;
            resp.getWriter().println(result);
        }
        else if(operator.equals("-")){
            int result=number1-number2;
            resp.getWriter().println(result);

        }
        else{
            resp.getWriter().println("Wrong calculation");
        }


    }
}