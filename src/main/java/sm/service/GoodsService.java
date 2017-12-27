package sm.service;

import sm.pojo.NoveGoods;

public interface GoodsService {

	//通过商品ID得到商品
	NoveGoods getSelectResult(Integer goodsId);

}
