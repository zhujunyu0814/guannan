package com.xsl.middle_school_oa.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table article
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.view_count
     *
     * @mbg.generated
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.create_user_id
     *
     * @mbg.generated
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_type_id
     *
     * @mbg.generated
     */
    private Integer articleTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.create_user_name
     *
     * @mbg.generated
     */
    private String createUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.file_urls
     *
     * @mbg.generated
     */
    private String fileUrls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.file_names
     *
     * @mbg.generated
     */
    private String fileNames;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.confirm_status
     *
     * @mbg.generated
     */
    private Integer confirmStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.host_id
     *
     * @mbg.generated
     */
    private Integer hostId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.is_delete
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.audience_ids_str
     *
     * @mbg.generated
     */
    private String audienceIdsStr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public Article(Integer id, String title, Date createTime, Date updateTime, Integer viewCount, Integer createUserId, Integer articleTypeId, String createUserName, String fileUrls, String fileNames, Integer confirmStatus, Integer hostId, Integer isDelete, String audienceIdsStr, String content) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.viewCount = viewCount;
        this.createUserId = createUserId;
        this.articleTypeId = articleTypeId;
        this.createUserName = createUserName;
        this.fileUrls = fileUrls;
        this.fileNames = fileNames;
        this.confirmStatus = confirmStatus;
        this.hostId = hostId;
        this.isDelete = isDelete;
        this.audienceIdsStr = audienceIdsStr;
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public Article() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.create_time
     *
     * @return the value of article.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.create_time
     *
     * @param createTime the value for article.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.update_time
     *
     * @return the value of article.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.update_time
     *
     * @param updateTime the value for article.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.view_count
     *
     * @return the value of article.view_count
     *
     * @mbg.generated
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.view_count
     *
     * @param viewCount the value for article.view_count
     *
     * @mbg.generated
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.create_user_id
     *
     * @return the value of article.create_user_id
     *
     * @mbg.generated
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.create_user_id
     *
     * @param createUserId the value for article.create_user_id
     *
     * @mbg.generated
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_type_id
     *
     * @return the value of article.article_type_id
     *
     * @mbg.generated
     */
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_type_id
     *
     * @param articleTypeId the value for article.article_type_id
     *
     * @mbg.generated
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.create_user_name
     *
     * @return the value of article.create_user_name
     *
     * @mbg.generated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.create_user_name
     *
     * @param createUserName the value for article.create_user_name
     *
     * @mbg.generated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.file_urls
     *
     * @return the value of article.file_urls
     *
     * @mbg.generated
     */
    public String getFileUrls() {
        return fileUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.file_urls
     *
     * @param fileUrls the value for article.file_urls
     *
     * @mbg.generated
     */
    public void setFileUrls(String fileUrls) {
        this.fileUrls = fileUrls == null ? null : fileUrls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.file_names
     *
     * @return the value of article.file_names
     *
     * @mbg.generated
     */
    public String getFileNames() {
        return fileNames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.file_names
     *
     * @param fileNames the value for article.file_names
     *
     * @mbg.generated
     */
    public void setFileNames(String fileNames) {
        this.fileNames = fileNames == null ? null : fileNames.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.confirm_status
     *
     * @return the value of article.confirm_status
     *
     * @mbg.generated
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.confirm_status
     *
     * @param confirmStatus the value for article.confirm_status
     *
     * @mbg.generated
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.host_id
     *
     * @return the value of article.host_id
     *
     * @mbg.generated
     */
    public Integer getHostId() {
        return hostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.host_id
     *
     * @param hostId the value for article.host_id
     *
     * @mbg.generated
     */
    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.is_delete
     *
     * @return the value of article.is_delete
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.is_delete
     *
     * @param isDelete the value for article.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.audience_ids_str
     *
     * @return the value of article.audience_ids_str
     *
     * @mbg.generated
     */
    public String getAudienceIdsStr() {
        return audienceIdsStr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.audience_ids_str
     *
     * @param audienceIdsStr the value for article.audience_ids_str
     *
     * @mbg.generated
     */
    public void setAudienceIdsStr(String audienceIdsStr) {
        this.audienceIdsStr = audienceIdsStr == null ? null : audienceIdsStr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}