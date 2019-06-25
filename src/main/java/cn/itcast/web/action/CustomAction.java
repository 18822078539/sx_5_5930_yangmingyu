package cn.itcast.web.action;

import cn.itcast.pojo.Custome;
import cn.itcast.service.CustomService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author level
 * @create 2019/6/20 - 0:13
 */
/**
 * 20165930杨明宇
 */
@Controller
public class CustomAction extends ActionSupport {
    @Resource
    CustomService customService;
    public Custome custome;

    public CustomService getCustomService() {
        return customService;
    }

    public void setCustomService(CustomService customService) {
        this.customService = customService;
    }

    public Custome getCustome() {
        return custome;
    }

    public void setCustome(Custome custome) {
        this.custome = custome;
    }

    public String show() {
        List<Custome> all = customService.findAll();
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("list", all);
        return "zhanshi";
    }
    public String toadd(){
        return "toadd";
    }
    public String save(){
        customService.add(custome);
        return "success";
    }
    public String delete(){
        customService.delete(custome);
        return "success";
    }
    public String toupdate(){
        Custome custome1 = customService.finById(custome);
        HttpServletRequest request=ServletActionContext.getRequest();
        request.setAttribute("dept",custome1);
        return "toupdate";
    }
    public String update(){
//        customService.update(custome);
//        return "success";

        String str = String.valueOf(custome.getCpost());
        System.out.println(str.length());
        for(char c : str.toCharArray()){
            System.out.println(c);
        }
        if ("".equals(custome.getCname())) {
            HttpServletRequest request = ServletActionContext.getRequest();
            request.setAttribute("msg", "客户名称不可为空");
            return "error";
        } else if (str.length()!=6) {
            HttpServletRequest request = ServletActionContext.getRequest();
            request.setAttribute("msg1", "只能输入6位数字");
            return "error";
        } else {
            customService.update(custome);
            return "success";
        }

    }
}
