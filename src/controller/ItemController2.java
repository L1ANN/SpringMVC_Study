package controller;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import pojo.Items;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 16:31 2017/11/14
 * @Modified By:
 */
public class ItemController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException,IOException {
        List<Items> itemsList = new ArrayList<>();

        Items items_1 = new Items("联想笔记本","6000f","ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items("苹果手机","5000f","ipone6苹果手机!");

        itemsList.add(items_1);
        itemsList.add(items_2);

        httpServletRequest.setAttribute("itemsList",itemsList);
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/itemsList.jsp").forward(httpServletRequest,httpServletResponse);

    }
}
