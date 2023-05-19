package com.zhoudafeng.im.pojo;


public class User {
    private String uId;
    private String uName;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                '}';
    }

    public static void initSystem(){
        System.out.println("====>>>application初始化完成方法被执行");
    }
}
