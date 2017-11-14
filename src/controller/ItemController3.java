package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 17:13 2017/11/14
 * @Modified By:
 */
@Controller
public class ItemController3 {

    //商品列表：@RequestMapping中url建议和方法各一样，方便开发维护
    @RequestMapping("/queryItems")
    public ModelAndView queryItems(){
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
