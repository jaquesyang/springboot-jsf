package com.example.demo.jsf;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 * Created by jaquesyang on 2017/7/5.
 */
@Data

//@ManagedBean
//@RequestScoped
@Scope("session")
@Component
@NoArgsConstructor
public class HelloBean extends BaseBean {

    @Autowired
    ItemRepository repository;

    private String name;

    public String sayHi() {
        Item item = repository.findOne(1L);

        return "hi, " + item.getName();
    }

    public String getUrlName() {
        if (name == null) {
            name = getHttpServletRequest().getParameter("name");
        }

        return name;
    }
}
