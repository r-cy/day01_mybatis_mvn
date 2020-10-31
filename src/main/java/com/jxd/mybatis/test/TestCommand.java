package com.jxd.mybatis.test;

import com.jxd.mybatis.model.Command;
import com.jxd.mybatis.model.Msg;
import com.jxd.mybatis.service.ICommandService;
import com.jxd.mybatis.service.impl.CommandServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestCommand
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/16
 * @Version 1.0
 */
public class TestCommand {
    public static void main(String[] args) {
        ICommandService commandService = new CommandServiceImpl();
        Command command = commandService.getOne(2);
        System.out.println(command.getCname() + ":");

        for (Msg msg : command.getMsgList()){
            System.out.println(msg.getContent());
        }

        /*List<Msg> list = new ArrayList<>();
        Msg msg1 = new Msg();
        msg1.setContent("批量插入测试1");
        msg1.setCid(3);
        list.add(msg1);

        Msg msg2 = new Msg();
        msg2.setContent("批量插入测试2");
        msg2.setCid(4);
        list.add(msg2);
        boolean flag = commandService.insert(list);
        if (flag){
            System.out.println("批量插入成功！！！");
        }*/
        /*List<Msg> list = new ArrayList<>();
        Msg msg1 = new Msg();
        msg1.setMid(7);
        msg1.setContent("批量更新1");
        msg1.setCid(4);
        list.add(msg1);

        Msg msg2 = new Msg();
        msg2.setMid(8);
        msg2.setContent("批量更新2");
        msg2.setCid(4);
        list.add(msg2);
        boolean flag = commandService.update(list);
        if (flag){
            System.out.println("批量更新成功！！！");
        }*/
    }
}
