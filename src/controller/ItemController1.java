package controller;



import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import pojo.Items;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:L1ANN
 * @Description: 后端控制器Handler
 * @Date:Created in 14:21 2017/11/14
 * @Modified By:
 */
public class ItemController1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        List<Items> itemsList = new ArrayList<>();

        Items items_1 = new Items("联想笔记本","6000f","ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items("苹果手机","5000f","ipone6苹果手机!");

        itemsList.add(items_1);
        itemsList.add(items_2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);
        modelAndView.setViewName("/WEB-INF/jsp/itemsList.jsp");
        return modelAndView;

    }
}
