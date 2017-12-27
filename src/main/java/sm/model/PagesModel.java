package sm.model;

import java.io.Serializable;

/**
 * 鍒嗛〉瀵硅薄绫�
 * Created by YangKang on 2017/7/10.
 */
public class PagesModel implements Serializable {

    private String orderDirection = "desc";
    private String orderField;
    private Integer pageCurrent = 1;
    private Integer pageSize = 15;

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public Integer getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PagesModel{" +
                "orderDirection='" + orderDirection + '\'' +
                ", orderField='" + orderField + '\'' +
                ", pageCurrent=" + pageCurrent +
                ", pageSize=" + pageSize +
                '}';
    }
}
