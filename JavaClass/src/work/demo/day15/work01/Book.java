package work.demo.day15.work01;

import java.util.Scanner;

public class Book {
    String title;
    private int pageNum ;

    public void detail(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入书名");
        this.title = s.next();
        System.out.println("请输入页数");
        int num = s.nextInt();
        if (num<200){
            System.out.println("小于200页默认为200页");
            this.pageNum=200;
        }else{
            this.pageNum = num;
        }
        System.out.println("有一本"+this.title+"，总共有"+this.pageNum+"页");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
    }
}
