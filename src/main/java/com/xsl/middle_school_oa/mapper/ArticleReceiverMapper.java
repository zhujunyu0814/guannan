package com.xsl.middle_school_oa.mapper;

import com.xsl.middle_school_oa.domain.ArticleReceiver;
import com.xsl.middle_school_oa.domain.ArticleReceiverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleReceiverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    long countByExample(ArticleReceiverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int deleteByExample(ArticleReceiverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int insert(ArticleReceiver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int insertSelective(ArticleReceiver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    List<ArticleReceiver> selectByExample(ArticleReceiverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    ArticleReceiver selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ArticleReceiver record, @Param("example") ArticleReceiverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ArticleReceiver record, @Param("example") ArticleReceiverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ArticleReceiver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_receiver
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ArticleReceiver record);
}