package com.oldfish.mooc.springdubbo.quickstart;

import com.oldfish.mooc.springdubbo.ServiceAPI;

/**
 * @author
 * @description
 * @date 2019/5/13
 */
public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quickstart-message="+message;
    }
}
