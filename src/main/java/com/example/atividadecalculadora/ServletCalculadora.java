package com.example.atividadecalculadora;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculadora", value = "/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String svalor1 = request.getParameter("valor1");
        String svalor2 = request.getParameter("valor2");
        String opcao = request.getParameter("opcao");

        double dvalor1 = Double.parseDouble(svalor1);
        double dvalor2 = Double.parseDouble(svalor2);

        double resultado = 0;

        if(opcao.equals("+")){
            resultado = dvalor1 + dvalor2;
        }else if(opcao.equals("-")){
            resultado = dvalor1 - dvalor2;
        } else if (opcao.equals("*")) {
            resultado = dvalor1 * dvalor2;
        } else if (opcao.equals("/")) {
            resultado = dvalor1 / dvalor2;
        }

        out.print("Resultado<br>"+resultado);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

    {

    }
}
