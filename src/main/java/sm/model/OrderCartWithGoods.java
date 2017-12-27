package sm.model;

/**
 * Created by YangKang on 2017/8/24.
 */
public class OrderCartWithGoods extends OrderCart {

    private GoodsInfo goodsInfo;

  //  private GoodsStdSpec spec;

    public GoodsInfo getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    /*public GoodsStdSpec getSpec() {
        return spec;
    }

    public void setSpec(GoodsStdSpec spec) {
        this.spec = spec;
    }*/
}
