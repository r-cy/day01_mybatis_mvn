package com.jxd.mybatis.model;

/**
 * @ClassName Msg
 * @Description TODO
 * @Author renchunyu
 * @Date 2020/10/16
 * @Version 1.0
 */
public class Msg {
    private int mid;
    private String content;
    private int cid;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

}
