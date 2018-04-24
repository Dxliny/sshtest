package com.dxlin.Action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
    
    public String execute() {
        System.out.println("OK");
        String str = "2";

        return Action.SUCCESS;
    }


}
