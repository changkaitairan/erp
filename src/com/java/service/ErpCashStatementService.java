package com.java.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.bean.ErpCashStatement;

/*
 * 仓库余额表
 */
public interface ErpCashStatementService extends
		Service<ErpCashStatement, String> {

	// 通过仓库的ID和商品的ID获取商品的余量
	public int getNum(String warehouse_id, String goods_id);

	// 通过仓库的ID获取每种商品的余额集合
	public List<ErpCashStatement> getByWarehouseId(String warehouse_id);

	// 通过仓库的ID和商品的ID获取商品的集合
	public List<ErpCashStatement> getByWIAndGI(@Param("warehouse_id") String warehouse_id,
			@Param("goods_id") String goods_id);
	//根据仓库的id和商品的id更新商品的数量
	//根据仓库的id和商品的id更新商品的数量
	public void updateNum(ErpCashStatement erpcash);
}


