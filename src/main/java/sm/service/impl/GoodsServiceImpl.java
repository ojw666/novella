package sm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sm.dao.LoginMapper;
import sm.dao.NoveGoodsMapper;
import sm.pojo.NoveGoods;
import sm.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private NoveGoodsMapper noveGoodsMapper;

	@Override
	public NoveGoods getSelectResult(Integer goodsId) {
		NoveGoods noveGoods = null;
		noveGoods = noveGoodsMapper.selectByPrimaryKey(goodsId);
		if(noveGoods != null){
			return noveGoods;
		}
		else
		{
			return null;
		}
	}

}
