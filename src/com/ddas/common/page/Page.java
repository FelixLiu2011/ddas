package com.ddas.common.page;

import java.util.List;

/**
 * ClassName:	Page
 * Function: 	数据分页封装
*
 * @author shaojunxiang
 * @date 12:26
 * @since JDK 1.6
 */
public class Page {
    /**分页的记录数*/
    private  int pageSize;
    /**当前分页(index)*/
    private int currentPage;
    /**总共的分页数*/
    private  int totalPages;
    /**总共的记录数**/
    private int totalCount;
    /**当前分页的数据*/
    private List<?> dataList;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        //设置总页数
        int left=this.totalCount%this.pageSize;
        int divid=this.totalCount/this.pageSize;
        setTotalPages(left==0?divid:(divid+1));
    }

    public List<?> getDataList() {
        return dataList;
    }

    public void setDataList(List<?> dataList) {
        this.dataList = dataList;
    }

    /**
     *获取分页数据的起始位置
     *@return int 此次分页数据的起始位置
     *@author shaojx
     *@date 2016/6/29 23:11
     *@version 1.0
     *@since 1.6
     */
    public int getPageStart(){
        return (currentPage-1)*pageSize;
    }
}
