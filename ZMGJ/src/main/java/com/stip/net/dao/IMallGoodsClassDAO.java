package com.stip.net.dao;

import java.util.List;

import com.stip.net.model.MallGoodsClass;
import com.stip.net.model.MallGoodsClassExample;

public interface IMallGoodsClassDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    int countByExample(MallGoodsClassExample example);

    /**
     * 获取热搜词分类集合
     * */
    List<MallGoodsClass> getClassNameForHotWords();
    
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    int deleteByExample(MallGoodsClassExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    void insert(MallGoodsClass record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    void insertSelective(MallGoodsClass record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    List<MallGoodsClass> selectByExample(MallGoodsClassExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    MallGoodsClass selectByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    int updateByExampleSelective(MallGoodsClass record, MallGoodsClassExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    int updateByExample(MallGoodsClass record, MallGoodsClassExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    int updateByPrimaryKeySelective(MallGoodsClass record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_mall_goods_class
     *
     * @ibatorgenerated Wed Dec 30 10:12:21 CST 2015
     */
    int updateByPrimaryKey(MallGoodsClass record);
    
    int selectClassMaxIndexByExample(MallGoodsClassExample example);
}