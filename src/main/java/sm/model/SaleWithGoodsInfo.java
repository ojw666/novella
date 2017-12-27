package sm.model;

/**
 * Created by YangKang on 2017/8/26.
 */
public class SaleWithGoodsInfo extends SaleList {

    private GoodsInfo goodsInfo;
    //private GoodsStdSpec goodsSpec;

    public GoodsInfo getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    /*public GoodsStdSpec getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(GoodsStdSpec goodsSpec) {
        this.goodsSpec = goodsSpec;
    }*/
}
